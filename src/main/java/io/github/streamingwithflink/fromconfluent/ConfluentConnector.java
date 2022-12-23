package io.github.streamingwithflink.fromconfluent;


import clickstream.events;
import io.github.streamingwithflink.util.ClickStream;
import io.github.streamingwithflink.windowfunction.CountProcessWindowFunction;
import org.apache.avro.generic.GenericRecord;
import org.apache.flink.api.common.eventtime.WatermarkStrategy;
import org.apache.flink.api.common.functions.AggregateFunction;
import org.apache.flink.connector.kafka.source.KafkaSource;
import org.apache.flink.connector.kafka.source.enumerator.initializer.OffsetsInitializer;
import org.apache.flink.formats.avro.registry.confluent.ConfluentRegistryAvroDeserializationSchema;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.KeyedStream;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.windowing.ProcessWindowFunction;
import org.apache.flink.streaming.api.windowing.assigners.TumblingProcessingTimeWindows;
import org.apache.flink.streaming.api.windowing.time.Time;
import org.apache.flink.streaming.api.windowing.windows.TimeWindow;
import org.apache.flink.util.Collector;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ConfluentConnector {

    public static void main(String[] args) throws Exception {

        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.getConfig().enableForceAvro();
        Map<String, String> registryConfigs = new HashMap<String, String>();
        registryConfigs.put("basic.auth.credentials.source", "USER_INFO");
        registryConfigs.put("basic.auth.user.info", "IFRFLOVIIH2RLLW4:+98G3E3FcBUOvg8/NTHmYvLz95aV4WbMrbW6vA4ABnbEiKZ5BSnmZc2TnTNnwhbh");

        KafkaSource<GenericRecord> source = KafkaSource.<GenericRecord>builder()
                .setProperty("sasl.mechanism", "PLAIN")
                .setProperty("client.dns.lookup", "use_all_dns_ips")
                .setProperty("security.protocol", "SASL_SSL")
                .setProperty("sasl.jaas.config",
                        "org.apache.kafka.common.security.plain.PlainLoginModule required username=\"457WKCARKL4VSRTD\" password=\"cm/0BEwVs91zoPtP8dUSZtkAc97V23e5TxwbhjyyUTQPSH7FeIdMv3Ts1+QeBaUh\";")
                .setBootstrapServers("pkc-gq2xn.asia-northeast3.gcp.confluent.cloud:9092")
                .setTopics("clickstream_topic")
                .setGroupId("flink-group")
                .setStartingOffsets(OffsetsInitializer.latest())
                .setValueOnlyDeserializer(ConfluentRegistryAvroDeserializationSchema
                        .forGeneric(events.getClassSchema(),
                                "https://psrc-kk5gg.europe-west3.gcp.confluent.cloud", registryConfigs)).build();

        DataStream<GenericRecord> stream = env.fromSource(source, WatermarkStrategy.noWatermarks(), "confluent");

        SingleOutputStreamOperator<String> keyedStream = stream.map(
                        record -> new ClickStream(String.valueOf(record.get("userid")),
                                String.valueOf(record.get("ip")),
                                String.valueOf(record.get("request")),
                                String.valueOf(record.get("status")),
                                String.valueOf(record.get("bytes"))
                        )
                )
                .keyBy(record -> record.userId)
                .window(TumblingProcessingTimeWindows.of(Time.seconds(10)))
                .process(new ProcessWindowFunction<ClickStream, String, String, TimeWindow>() {

                    @Override
                    public void process(String s, ProcessWindowFunction<ClickStream, String, String, TimeWindow>.Context context, Iterable<ClickStream> iterable, Collector<String> collector) throws Exception {
                        Integer count = 0;
                        for (ClickStream clickStream : iterable) {
                            count++;
                        }
                        collector.collect("key: " + s + ", count: " + String.valueOf(count));
                    }
                });

        keyedStream.print();

        env.execute("connecting-confluent");

    }

}
