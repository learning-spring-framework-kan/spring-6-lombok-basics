package com.kanwar.spring6lombokbasics.domain;

import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
@Builder
public class Person {
    private UUID id;
    private String firstName;
    private String lastName;
    private int age;
    private Date dob;
}
