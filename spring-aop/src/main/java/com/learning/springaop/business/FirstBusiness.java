package com.learning.springaop.business;

import com.learning.springaop.aspect.TrackTime;
import com.learning.springaop.data.FirstDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirstBusiness {

    @Autowired
    private FirstDAO firstDAO;

    @TrackTime
    public String calculateSomething() {
        return firstDAO.retrieveSomething();
    }
}