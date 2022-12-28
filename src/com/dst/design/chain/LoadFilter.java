package com.dst.design.chain;

/**
 * @author dushuaitong
 * @description: 过滤器1
 * @date 2022/12/28
 */
public class LoadFilter implements Filter, Order {
    @Override
    public void filter(String param, FilterChain chain) {
        System.out.println("LoadFilter");
//        if (condation) {
//            stop 逻辑
//        }
        chain.filter("", chain);
    }

    @Override
    public int order() {
        return 0;
    }
}
