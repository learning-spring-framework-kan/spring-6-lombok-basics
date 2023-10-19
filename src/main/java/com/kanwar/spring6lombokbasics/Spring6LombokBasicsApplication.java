package com.kanwar.spring6lombokbasics;

import com.kanwar.spring6lombokbasics.domain.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class Spring6LombokBasicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring6LombokBasicsApplication.class, args);


		Person p = Person.builder()
				.firstName("kanwar")
				.lastName("singh")
				.age(24)
				.dob(Date.valueOf("2023-10-23"))
				.build();

		System.out.println(p);

	}

}
