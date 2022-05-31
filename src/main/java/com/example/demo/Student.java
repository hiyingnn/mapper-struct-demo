package com.example.demo;

import lombok.*;

/**
 * DTO object
 */
@Data
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String fullName;
    private int age; // map by name implicitly
    private Long studentNo; // need map by name explicitly and type implicitly;
    private double bursaryAmount; // map by name implicitly but nested
    private String creds; // map by name explicitly but nested
}
