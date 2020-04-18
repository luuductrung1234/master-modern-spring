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

    @Before("com.learning.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void authorizeUser(JoinPoint joinPoint) {
        logger.info("Check for user access");
        logger.info("Allowed execution for {}", joinPoint);
    }

    @Before("com.learning.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void beforeRunMethodCall() {
        logger.info("Intercepted before method calls");
    }
}