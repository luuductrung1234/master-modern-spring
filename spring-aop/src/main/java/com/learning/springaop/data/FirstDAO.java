package com.learning.springaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class FirstDAO {
    public String retrieveSomething() {
        return "First DAO";
    }
}