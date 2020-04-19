package com.learning.databasedemo.jdbc;

import java.sql.Timestamp;
import java.util.List;

import com.learning.databasedemo.PersonRepository;
import com.learning.databasedemo.entity.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("jdbc")
public class JdbcPersonRepositoryImpl implements PersonRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> findAll() {
        return jdbcTemplate.query("SELECT * FROM person", new PersonRowMapper());
    }

    @Override
    public Person findById(int id) {
        return jdbcTemplate.queryForObject("SELECT * FROM person WHERE id=?", new Object[] { id },
                new PersonRowMapper());
    }

    @Override
    public int deleteById(int id) {
        return jdbcTemplate.update("DELETE FROM person WHERE id=?", id);
    }

    @Override
    public int insert(Person person) {
        return jdbcTemplate.update("INSERT INTO person (id, name, location, birth_date) " + "VALUES(?, ?, ?, ?)",
                person.getId(), person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime()));
    }

    @Override
    public int update(Person person) {
        return jdbcTemplate.update("UPDATE person " + " SET name = ?, location = ?, birth_date = ? " + " WHERE id = ?",
                person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime()), person.getId());
    }
}