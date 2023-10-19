package com.kanwar.spring6lombokbasics.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyControllerTest {

    @Autowired
    MyController controller;

    @Test
    void getPersonbyId() {
        System.out.println(controller.getPersonbyId(UUID.randomUUID()));
    }
}