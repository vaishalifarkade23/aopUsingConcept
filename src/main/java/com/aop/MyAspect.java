package com.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect
{
	//@Before("execution(com.aop.service.PaymentServiceImpl.makePayment())")
	@Before("execution(* com.aop.service.PaymentServiceImpl.makePayment(..))")
	public void printBefore()
	{
		System.out.println("payment started");
	}
	
	@After("execution(* com.aop.service.PaymentServiceImpl.makePayment(..))")
	public void printafter()
	{
		System.out.println("payment done");
	}

}
