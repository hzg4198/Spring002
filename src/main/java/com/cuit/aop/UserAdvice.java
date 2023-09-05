package com.cuit.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAdvice {

    @Pointcut("execution(* com.cuit.service.Impl.UserServiceImpl.*(..))")
    public void pc(){};

//    @Around("pc()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object proceed = null;
        for (int i = 0; i < 10000; i++) {
            proceed = joinPoint.proceed();
        }
        long endTime = System.currentTimeMillis();
        System.out.println(joinPoint.getSignature() + "运行一万次花了" + (endTime - startTime) + "ms");
        return proceed;
    }
}
