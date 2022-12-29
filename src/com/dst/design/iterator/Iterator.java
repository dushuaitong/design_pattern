package com.dst.design.iterator;

/**
 * @author dushuaitong
 * @description: 迭代器
 * @date 2022/12/29
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
