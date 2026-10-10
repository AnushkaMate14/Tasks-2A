package DSA_50.StackQueue;

import java.util.*;

public class LRUCache_32 {

    static class Cache extends LinkedHashMap<Integer, Integer> {

        int capacity;

        Cache(int capacity) {
            super(capacity, 0.75f, true);
            this.capacity = capacity;
        }

        protected boolean removeEldestEntry(
                Map.Entry<Integer, Integer> eldest) {

            return size() > capacity;
        }
    }

    public static void main(String[] args) {

        Cache cache = new Cache(2);

        cache.put(1, 10);
        cache.put(2, 20);

        System.out.println(cache.get(1));

        cache.put(3, 30);

        System.out.println(cache);
    }
}