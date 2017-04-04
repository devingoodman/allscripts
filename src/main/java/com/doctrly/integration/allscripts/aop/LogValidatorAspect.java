package com.doctrly.integration.allscripts.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Slf4j
@Aspect
@Component
public class LogValidatorAspect {


    @Around("execution(* com.doctrly..*RestController.*(..)) && args(tenant, ..)")
    public Object logRestController(ProceedingJoinPoint joinPoint, String tenant) throws Throwable
    {
        log.info("\t==== Begin of {}", joinPoint.getSignature().toShortString());
        //log.info("Parameter: {}", (joinPoint.getArgs()[1] != null? joinPoint.getArgs()[1].toString(): null) );

        long start = System.currentTimeMillis();
        Object retVal = joinPoint.proceed();
        long elapsedTime = System.currentTimeMillis() - start;

        //log.info("Return: {}", (retVal != null? retVal.toString(): null) );
        log.info("\t==== End of {} - {} ms.",joinPoint.getSignature().toShortString(), elapsedTime);
        return retVal;
    }


    @Around("execution(* com.doctrly..*Service.*(..))")
    public Object logService(ProceedingJoinPoint joinPoint) throws Throwable
    {
        log.info("\t==== Begin of {}", joinPoint.getSignature().toShortString());
        //log.info("Parameter: {}", (joinPoint.getArgs()[0] != null? joinPoint.getArgs()[0].toString(): null) );

        long start = System.currentTimeMillis();
        Object retVal = joinPoint.proceed();
        long elapsedTime = System.currentTimeMillis() - start;

        //log.info("Return: {}", (retVal != null? retVal.toString(): null) );
        log.info("\t==== End of {} - {} ms.", joinPoint.getSignature().toShortString(), elapsedTime);
        return retVal;
    }

}
