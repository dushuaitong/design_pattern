package com.dst.design.builder.stand;

/**
 * @author dushuaitong
 * @description: 客户端
 * @date 2022/3/29
 */
public class Client {
    public static Person createPerson(PersonBuilder personBuilder) {
        personBuilder.buildBody().buildHeader().buildFooter();
        return personBuilder.build();
    }
}
