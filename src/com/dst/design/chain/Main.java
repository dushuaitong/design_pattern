package com.dst.design.chain;

/**
 * @author dushuaitong
 * @description: test
 * @date 2022/12/28
 */
public class Main {
    public static void main(String[] args) {
        FilterChain chain = FilterChainFactory.getFilterChain();
        chain.filter("begain", chain);
    }
}
