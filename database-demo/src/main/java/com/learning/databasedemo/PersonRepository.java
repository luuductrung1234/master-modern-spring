package com.learning.databasedemo;

import java.util.List;

import com.learning.databasedemo.entity.Person;

public interface PersonRepository {
    public List<Person> findAll();

    public Person findById(int id);

    public int deleteById(int id);

    public int insert(Person person);

    public int update(Person person);
}