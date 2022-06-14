package com.example.demo.cache;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarCache {

    private final CarApi carApi;
    private CarResponse carResponse;

    @CacheEvict(value = "cars", allEntries = true)
    public void evictCache() {
    }

    public void populateCache() {
        CarResponse carResponse = carApi.getAllCar();
        carResponse.getResults().forEach(cacheables::populateEntry);
    }

    public CarInfo populateEntry(CarInfo carInfo) {
        System.out.println("caching carInfo");
        System.out.println(carInfo.getMake_ID());
        return carInfo;
    }
}
