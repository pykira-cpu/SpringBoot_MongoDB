package com.example.demo.repository;


import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
	public Person findByFirstName(String firstName);
	//public Person findByLastName(String lastName);
	public List<Person> findByAge(int age);
	
}

