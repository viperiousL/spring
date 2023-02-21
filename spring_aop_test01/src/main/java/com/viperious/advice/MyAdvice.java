package com.viperious.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//增强类,内部提供增强方法
@Component
@Aspect
public class MyAdvice {
    //切点表达式的抽取
    @Pointcut("execution(* com.viperious.service.impl.*.*(..))")
    public void myPointcut(){}

    //<aop:before method="beforeAdvice" pointcut-ref="execution(* com.viperious.com.viperious.service.impl.*.*(..))"/>
//    @Before("execution(* com.viperious.com.viperious.service.impl.*.*(..))")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("当前目标对象是:"+joinPoint.getTarget());
        System.out.println("表达式:"+joinPoint.getStaticPart());
        System.out.println("前置的增强....");
    }

//    @AfterReturning("execution(* com.viperious.com.viperious.service.impl.*.*(..))")
    public void afterReturningAdvice(){
        System.out.println("后置的增强....");
    }

//    @Around("execution(* com.viperious.com.viperious.service.impl.*.*(..))")
    @Around("MyAdvice.myPointcut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前的增强....");
        //环绕目标方法
        Object res = proceedingJoinPoint.proceed();//执行目标方法
        System.out.println("环绕后的增强....");
        return res;
    }

//    @AfterThrowing(pointcut = "execution(* com.viperious.com.viperious.service.impl.*.*(..))",throwing = "e")
    public void afterThrowingAdvice(Throwable e){
        System.out.println("当前异常信息是:"+e);
        System.out.println("异常抛出通知...报异常才执行");
    }

//    @After("execution(* com.viperious.com.viperious.service.impl.*.*(..))")
    public void afterAdvice(){
        System.out.println("最终的增强....");
    }

}
