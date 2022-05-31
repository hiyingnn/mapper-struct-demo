package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MapperTest {
    @Autowired
    StudentMapper studentMapper;

    @Test
    void test () {
       Student student =  Student.builder()
                .age(1)
                .fullName("Alice Tan")
                .bursaryAmount(3113)
                .studentNo(7L)
                .creds("Is a new student but hardworking")
                .build();

        Scholar scholar = studentMapper.toScholar(student);
        System.out.println(scholar);

        Student inverseStudent = studentMapper.toStudent(scholar);
        System.out.println(inverseStudent);
    }
}
