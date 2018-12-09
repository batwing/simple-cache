package com.slowmo.cache.lru;

import org.junit.Test;

import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class LruCacheLimitedCapacityTest {
    @Test
    public void testGet() {
        LruCacheLimitedCapacity<Integer, String> cache = new LruCacheLimitedCapacity<>(2);
        assertNotNull(cache);
        cache.put(1, "test-1");
        cache.put(2, "test-2");
        cache.put(3, "test-3");
        assertEquals(2, cache.size());
        cache.get(2);
        cache.put(9, "test-9");
        assertEquals("2,9", cache.keySet().stream().map(x -> x.toString()).collect(Collectors.joining(",")));
    }
}
