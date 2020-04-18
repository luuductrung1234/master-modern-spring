package com.learning.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeBusinessAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // What kind of method calls I would intercept
    // execution(* PACKAGE.*.*(..))

    @Before("execution(* com.learning.springaop.business.*.*(..))")
    public void authorizeUser(JoinPoint joinPoint) {
        logger.info("Check for user access");
        logger.info("Allowed execution for {}", joinPoint);
    }

    @Before("execution(* com.learning.springaop.business.*.*(..))")
    public void beforeRunMethodCall() {
        logger.info("Intercepted before method calls");
    }
}