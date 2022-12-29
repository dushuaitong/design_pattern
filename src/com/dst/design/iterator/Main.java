package com.dst.design.iterator;

/**
 * @author dushuaitong
 * @description: 测试
 * @date 2022/12/29
 */
public class Main {
    public static void main(String[] args) {
        Collecctors<String> cl = new Collecctors();
        cl.add("hello");
        cl.add("hello");
        cl.add("hello");
        Iterator<String> iterator = cl.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
