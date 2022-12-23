package io.github.streamingwithflink.windowfunction;

import io.github.streamingwithflink.util.ClickStream;
import org.apache.flink.streaming.api.scala.function.ProcessWindowFunction;
import org.apache.flink.streaming.api.windowing.windows.TimeWindow;
import org.apache.flink.util.Collector;
import scala.collection.Iterable;

public class CountProcessWindowFunction extends ProcessWindowFunction<ClickStream, Long, String, TimeWindow> {
    @Override
    public void process(String s, ProcessWindowFunction<ClickStream, Long, String, TimeWindow>.Context context, Iterable<ClickStream> elements, Collector<Long> out) throws Exception {
        long count = 0;
//        for (ClickStream in: elements){
//            count ++;
//        }
        out.collect(count);
    }
}
