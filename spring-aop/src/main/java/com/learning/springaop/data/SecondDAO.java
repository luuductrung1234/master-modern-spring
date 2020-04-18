package com.learning.springaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class SecondDAO {
    public String retrieveSomething() {
        return "Second DAO";
    }
}