package com.dst.design.builder.stand;

/**
 * @author dushuaitong
 * @description: 人类
 * @date 2022/3/29
 */
public abstract class Person {
    protected String body;
    protected String header;
    protected String footer;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }
}
