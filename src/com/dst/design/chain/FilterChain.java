package com.dst.design.chain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author dushuaitong
 * @description: 责任链
 * @date 2022/12/28
 */
public class FilterChain implements Filter {
    private List<Filter> chains;
    private int index;

    public FilterChain() {
        chains = new ArrayList<>();
        index = 0;
    }

    public void addChain(Filter filter) {
        chains.add(filter);
        chains.sort((Comparator.comparingInt(Order::order)));
    }

    @Override
    public void filter(String param, FilterChain chain) {
        if (index > chains.size() - 1) {
            return;
        }
        Filter filter = chains.get(index++);
        filter.filter(param, chain);
    }

    @Override
    public int order() {
        return 0;
    }
}
