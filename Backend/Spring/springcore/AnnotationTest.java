package com.capgemini.springcore.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationTest {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(App1.class);
	 Author author=context.getBean(Author.class);
	 System.out.println(author.getName());
	 
	 Book book=context.getBean(Book.class);
	 System.out.println(book.getName());
	
	
	
	}

}
