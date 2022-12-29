package com.dst.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dushuaitong
 * @description: 集合
 * @date 2022/12/29
 */
public class Collecctors<T> {
    private List<T> data = new ArrayList<>();

    public Iterator<T> iterator() {
        return new Itator<>();
    }

    public void add(T element) {
        data.add(element);
    }

    public void remove(int index) {
        data.remove(index);
    }

    private class Itator<T> implements Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < data.size();
        }

        @Override
        public T next() {
            return (T) data.get(index++);
        }
    }
}
