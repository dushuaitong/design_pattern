package com.dst.design.builder.stand;

/**
 * @author dushuaitong
 * @description: 人类构建类
 * @date 2022/3/29
 */
public abstract class PersonBuilder {
    public abstract PersonBuilder buildBody();
    public abstract PersonBuilder buildHeader();
    public abstract PersonBuilder buildFooter();
    public abstract Person build();
}
