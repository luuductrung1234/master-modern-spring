package com.learning.databasedemo.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.learning.databasedemo.entity.Person;

import org.springframework.jdbc.core.RowMapper;

public class PersonRowMapper implements RowMapper<Person> {

    @Override
    public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Person(rs.getInt("id"), rs.getString("name"), rs.getString("location"),
                rs.getTimestamp("birth_date"));
    }
}