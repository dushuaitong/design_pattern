package com.dst.design.builder.stand;

/**
 * @author dushuaitong
 * @description: 那人构建类
 * @date 2022/3/29
 */
public class ManPersonBuiler extends PersonBuilder {
    private Man man;

    public ManPersonBuiler() {
        man = new Man();
    }

    @Override
    public PersonBuilder buildBody() {
        man.body = "man body";
        return this;
    }

    @Override
    public PersonBuilder buildHeader() {
        man.header = "man header";
        return this;
    }

    @Override
    public PersonBuilder buildFooter() {
        man.footer = "man footer";
        return this;
    }

    @Override
    public Man build() {
        return man;
    }
}
