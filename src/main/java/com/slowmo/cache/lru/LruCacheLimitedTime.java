package com.slowmo.cache.lru;

import lombok.AllArgsConstructor;

import java.util.Map;
import java.util.PriorityQueue;

@AllArgsConstructor
public class LruCacheLimitedTime<K, V, T> implements ICache<K, V>{
    private Map<K, V> storage;
    private PriorityQueue<K, T> timeQueue;

    public V get(K key) {
        return null;
    }

    public void put(K key, V value) {

    }
}
