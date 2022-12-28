package com.dst.design.chain;

/**
 * @author dushuaitong
 * @description: 过滤器管理类
 * @date 2022/12/28
 */
public class FilterChainFactory {
    public static FilterChain getFilterChain() {
        FilterChain chain = new FilterChain();
        Filter filter1 = new LoadFilter();
        Filter filter2 = new NewFilter();
        chain.addChain(filter1);
        chain.addChain(filter2);
        return chain;
    }
}
