package com.example.springboot;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;
@Component
@Aspect
@Slf4j
public class EximpleAdvice {
    public int counter = -1;

    @Pointcut("execution(* com.example.springboot.ProductService.*(*))")
    public void pointcutProduct()
    {
    }

    @Before("pointcutProduct()")
    public void beforeAdvice(JoinPoint joinPoint)
    {
        counter += 1;
    }
}
