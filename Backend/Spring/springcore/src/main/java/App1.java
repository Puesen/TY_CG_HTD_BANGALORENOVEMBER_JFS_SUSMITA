package com.capgemini.springcore.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class App1 {	
	@Bean("Book")
	public Book getBook() {
		Book book=new Book();
		book.setName("jasxak");
		book.setAuthor(getAuthor());
		return book;
	}
	@Bean
	public Author getAuthor() {
		Author author=new Author();
		author .setName("R. S agrwal");
		return author;
	}


}


