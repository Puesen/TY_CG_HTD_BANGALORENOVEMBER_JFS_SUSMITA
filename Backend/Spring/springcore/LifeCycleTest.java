package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.Hello;

public class LifeCycleTest {
	
	
public static void main(String[] args) {
	//PathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml"); for destroy method using init in bean
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
Hello hello=context.getBean(Hello.class);//getbean returns object
System.out.println(hello.getCount());
System.out.println(hello.getMessage());
context.close();//destroy through interface

}
}
