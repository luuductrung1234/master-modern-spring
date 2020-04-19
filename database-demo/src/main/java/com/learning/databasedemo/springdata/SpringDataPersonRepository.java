package com.learning.databasedemo.springdata;

import com.learning.databasedemo.entity.Person;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataPersonRepository extends JpaRepository<Person, Integer> {

}