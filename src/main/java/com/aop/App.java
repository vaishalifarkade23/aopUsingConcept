package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context =new ClassPathXmlApplicationContext("com/aop/config.xml");
       PaymentService psobj=context.getBean("payment" ,PaymentService.class);
       psobj.makePayment(123);
    }
}
