package com.dst.design.chain;

/**
 * @author dushuaitong
 * @description: 过滤器2
 * @date 2022/12/28
 */
public class NewFilter implements Filter, Order {
    @Override
    public void filter(String param, FilterChain chain) {
        System.out.println("NewFilter");
        chain.filter("", chain);
    }

    @Override
    public int order() {
        return 100;
    }
}
