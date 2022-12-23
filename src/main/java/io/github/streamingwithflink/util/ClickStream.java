package io.github.streamingwithflink.util;

import java.util.Date;

public class ClickStream {

    public String userId;
    public String ip;
    public String request;
    public String status;
    public String bytes;

    @Override
    public String toString() {
        return "ClickStream{" +
                "userId='" + userId + '\'' +
                ", ip='" + ip + '\'' +
                ", request='" + request + '\'' +
                ", status='" + status + '\'' +
                ", bytes='" + bytes + '\'' +
                '}';
    }

    public ClickStream() {
    }

    public ClickStream(String userId, String ip, String request, String status, String bytes) {
        this.userId = userId;
        this.ip = ip;
        this.request = request;
        this.status = status;
        this.bytes = bytes;
    }

}
