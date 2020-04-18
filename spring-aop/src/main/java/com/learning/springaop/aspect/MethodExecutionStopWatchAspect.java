package com.learning.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionStopWatchAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // What kind of method calls I would intercept
    // execution(* PACKAGE.*.*(..))

    @Around("com.learning.springaop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("Time taken by {} is {}", joinPoint, timeTaken);
        return result;
    }
}