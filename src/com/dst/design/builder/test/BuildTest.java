package com.dst.design.builder.test;

import com.dst.design.builder.stand.Client;
import com.dst.design.builder.stand.Person;
import com.dst.design.builder.stand.WomanBuilder;
import com.dst.design.builder.simple.ActivityDemo;

/**
 * @author dushuaitong
 * @description: 建造者设计模式测试
 * @date 2022/3/29
 */
public class BuildTest {
    public static void main(String[] args) {
        Person person = Client.createPerson(new WomanBuilder());
        System.out.println(person.getBody());

        ActivityDemo build = new ActivityDemo.ActivityDemoBuilder().buildMoney("").buildDate("").build();
        System.out.println(build);

    }
}
