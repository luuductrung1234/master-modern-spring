package com.learning.databasedemo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.learning.databasedemo.PersonRepository;
import com.learning.databasedemo.entity.Person;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("jpa")
@Transactional
public class JpaPersonRepositoryImpl implements PersonRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Person> findAll() {
        TypedQuery<Person> findAllUsersQuery = entityManager.createNamedQuery("Person.findAll", Person.class);
        return findAllUsersQuery.getResultList();
    }

    @Override
    public Person findById(int id) {
        return entityManager.find(Person.class, id);
    }

    @Override
    public int deleteById(int id) {
        Person personToDelete = entityManager.find(Person.class, id);
        if (personToDelete == null)
            return 0;
        entityManager.remove(personToDelete);
        return 1;
    }

    @Override
    public int insert(Person person) {
        return update(person);
    }

    @Override
    public int update(Person person) {
        entityManager.merge(person);
        return 1;
    }
}