package com.line.study.springaop.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Aspect
@Component
public class LoggerAuto {

    @Pointcut("execution( public void com.line.study.springaop.service.TestService.doSomeThing())")
    public  void logPointcut(){
    }


    @Before("logPointcut()")
    public void logBeforAdvice (JoinPoint joinPoint){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>start timeStamp="+ System.currentTimeMillis());
    }


    @After("logPointcut()")
    public void logAfterAdvice(JoinPoint joinPoint){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>end timeStamp="+ System.currentTimeMillis());
    }

}
