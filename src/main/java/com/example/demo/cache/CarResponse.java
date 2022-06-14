package com.example.demo.cache;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CarResponse {
     @JsonProperty("Count")
     Long Count;
     @JsonProperty("Message")
     String Message;
     @JsonProperty("SearchCriteria")
     String SearchCriteria;
     @JsonProperty("Results")
     List<CarInfo> Results;
}
