package com.learning.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    // What kind of method calls I would intercept
    // execution(* PACKAGE.*.*(..))

    @Pointcut("execution(* com.learning.springaop.data.*.*(..))")
    public void dataLayerExecution() {
    }

    @Pointcut("execution(* com.learning.springaop.business.*.*(..))")
    public void businessLayerExecution() {
    }

    @Pointcut("dataLayerExecution() && businessLayerExecution()")
    public void allLayerExecution() {
    }

    @Pointcut("bean(First*)")
    public void beanStartingWithFirst() {
    }

    @Pointcut("bean(*dao*)")
    public void beanContainingDAO() {
    }

    @Pointcut("within(com.learning.springaop.data..*)")
    public void dataLayerExecutionWithWithin() {
    }

    @Pointcut("@annotation(com.learning.springaop.aspect.TrackTime)")
    public void trackTimeAnnotion() {
    }
}