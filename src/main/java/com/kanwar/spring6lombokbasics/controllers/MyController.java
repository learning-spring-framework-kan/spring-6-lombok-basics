package com.kanwar.spring6lombokbasics.controllers;

import com.kanwar.spring6lombokbasics.domain.Person;
import com.kanwar.spring6lombokbasics.services.PersonService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Controller
public class MyController {

    private final PersonService personService;

    public Person getPersonbyId(UUID id){

        log.debug("this is controller method in action..");

        return personService.getPersonById(id);
    }

}
