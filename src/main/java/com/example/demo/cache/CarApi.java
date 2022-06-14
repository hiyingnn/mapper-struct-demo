package com.example.demo.cache;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CarApi {

    private final RestTemplate restTemplate;

    public CarApi(RestTemplateBuilder restTemplateBuilder,
                  @Value("${cache.api.cars}") String rootUri) {
        System.out.println(rootUri);
        String rootUri2 = "https://vpic.nhtsa.dot.gov/api/";
        restTemplate = restTemplateBuilder
                .build();
    }

    public CarResponse getAllCar() {
         return restTemplate.getForObject("https://vpic.nhtsa.dot.gov/api/vehicles/getallmakes?format=json", CarResponse.class);
    }
}
