package com.example.demo;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface StudentMapper {
    @Mapping(target="firstName", expression="java(student.getFullName().split(\" \")[0])") //to try
    @Mapping(target="lastName", expression="java(student.getFullName().split(\" \")[1])") //to try
    @Mapping(target="identificationNo", source="studentNo")
    @Mapping(target="student", source=".")
    @Mapping(target="credentials", source="creds")
    @Mapping(target="personType", constant = "SCHOLAR")
    Scholar toScholar(Student student);

    @InheritInverseConfiguration
    Student toStudent(Scholar scholar);
}
