package com.learning.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterBusinessAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // What kind of method calls I would intercept
    // execution(* PACKAGE.*.*(..))

    @After("com.learning.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void afterRunMethodCall() {
        logger.info("Intercepted after method calls");
    }

    @AfterReturning(value = "com.learning.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()", returning = "result")
    public void receiveMethodResult(JoinPoint joinPoint, Object result) {
        logger.info("{} returned with value {}", joinPoint, result);
    }

    @AfterThrowing(value = "com.learning.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()", throwing = "exception")
    public void receiveMethodException(JoinPoint joinPoint, Exception exception) {
        logger.info("{} throw exception {}", joinPoint, exception);
    }
}