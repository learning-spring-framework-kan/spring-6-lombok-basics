package com.kanwar.spring6lombokbasics.services;

import com.kanwar.spring6lombokbasics.domain.Person;

import java.util.UUID;

public interface PersonService {

    Person getPersonById(UUID id);
}
