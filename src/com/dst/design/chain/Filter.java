package com.dst.design.chain;

/**
 * @author dushuaitong
 * @description: 过滤器
 * @date 2022/12/28
 */
public interface Filter extends Order {

    void filter(String param, FilterChain chain);
}
