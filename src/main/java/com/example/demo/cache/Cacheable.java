package com.example.demo.cache;

public interface Cacheable<T> {
     void evictCache();
     void populateCache();
     T populateEntry(T e);
}
