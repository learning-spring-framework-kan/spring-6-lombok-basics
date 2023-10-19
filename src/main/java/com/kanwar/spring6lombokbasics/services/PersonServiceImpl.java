package com.kanwar.spring6lombokbasics.services;

import com.kanwar.spring6lombokbasics.domain.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.UUID;

@Slf4j
@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public Person getPersonById(UUID id) {

        log.debug("this is Service method in action..");

        return Person.builder()
                .firstName("kanwar")
                .lastName("singh")
                .id(id)
                .age(24)
                .dob(Date.valueOf("2023-10-23"))
                .build();

    }
}
