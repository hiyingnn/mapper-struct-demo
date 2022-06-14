package com.example.demo.cache;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachePut;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CacheScheduler {
    private final CacheManager cacheManager;
    private final CarCache cacheables;

    @PostConstruct
    public void onStartUpLoad() {
        populateAllCaches();
    }


    @Scheduled(cron = "0 * * * * *")
    public void populateAllCaches() {
        System.out.println("populating caches");
        cacheables.evictCache();
        populateCache();

        Cache cars = this.cacheManager.getCache("cars");
        System.out.println(cars.get(11707L));
    }


}
