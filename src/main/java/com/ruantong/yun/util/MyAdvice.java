package com.ruantong.yun.util;

/**
 * author：yunshiyu
 * Date: 2023/9/6
 **/

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 通知类
 */
@Component
@Aspect
public class MyAdvice {
    /**
     * AOP切入点
     */
    @Pointcut("execution(boolean com.ruantong.yun.service.*Service.*(*,*))")
    private void pt(){}

    /**
     * AOP中的通知
     */
    //@Before("pt()")  // 切面=连接通知和切入点
    public void meth() {
        System.out.println(System.currentTimeMillis());
    }

   // @Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
        System.out.println(signature.getDeclaringTypeName());
        System.out.println(signature.getName());

        long begin = System.currentTimeMillis();
        for (int i=1; i<10000; i++) {
            pjp.proceed();
        }
        long end = System.currentTimeMillis();

        System.out.println("==该方法万次调用总执行时间===" + (end-begin));
    }

    @Around("pt()")
    public Object around2(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        for (int i=0; i<args.length; i++) {
            if (args[i].getClass().equals(String.class)) {
                args[i] = args[i].toString().trim();
            }
        }

        Object ret = pjp.proceed(args);
        return ret;
    }
}
