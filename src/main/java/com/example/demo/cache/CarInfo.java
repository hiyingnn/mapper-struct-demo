package com.example.demo.cache;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Value;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CarInfo {
    @JsonProperty("Make_ID")
    Long Make_ID;
    @JsonProperty("Make_Name")
    String Make_Name;

    public String getMake_ID() {
        return Make_ID.toString();
    }
}
