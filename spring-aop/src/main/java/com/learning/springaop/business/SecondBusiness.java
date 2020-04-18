package com.learning.springaop.business;

import com.learning.springaop.data.SecondDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecondBusiness {

    @Autowired
    private SecondDAO secondDAO;

    public String calculateSomething() {
        return secondDAO.retrieveSomething();
    }
}