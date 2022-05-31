package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * Entity object (POJO)
 */
@Data
@SuperBuilder
@NoArgsConstructor
@Getter
@ToString(callSuper = true)
public class Scholar extends Person {
    private double bursaryAmount;
    private Student student; //for audit
    private String credentials;
}
