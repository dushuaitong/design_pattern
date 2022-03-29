package com.dst.design.builder.stand;

/**
 * @author dushuaitong
 * @description: 女人构建类
 * @date 2022/3/29
 */
public class WomanBuilder extends PersonBuilder {
    private Woman woman;

    public WomanBuilder() {
        woman = new Woman();
    }

    @Override
    public PersonBuilder buildBody() {
        woman.body = "woman body";
        return this;
    }

    @Override
    public PersonBuilder buildHeader() {
        woman.header = "woman header";
        return this;
    }

    @Override
    public PersonBuilder buildFooter() {
        woman.footer = "woman footer";
        return this;
    }

    @Override
    public Person build() {
        return woman;
    }
}
