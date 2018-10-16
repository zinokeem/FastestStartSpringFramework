package org.spring.domain;

import java.util.List;

public class SampleDomain {

    private String header;
    private String body;
    private List<String> log;

    public String getHeader() {
        return header;
    }
    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public List<String> getLog() {
        return log;
    }
    public void setLog(List<String> log) {
        this.log = log;
    }

    /*@Override
    public String toString() {
        return "sampleDomain [header=" + header + ", body=" + body + "]";
    }*/
}
