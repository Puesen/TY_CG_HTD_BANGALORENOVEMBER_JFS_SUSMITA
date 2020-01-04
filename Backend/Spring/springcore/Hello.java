package com.capgemini.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hello {//implements InitializingBean,DisposableBean {
	public Hello() {
		System.out.println("object created");
	}
	public Hello(String message) {
		super();
		this.message=message;
	}
	
	private String message;
	private int count;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void setCount(int count) {
	      this.count=count;
	}
	
	public int getCount() {
		return count;
	}
	
	public void init() {
		System.out.println("init method");
		          
	}
	public void destroy() {
		System.out.println("destroy method");
	}

//	public void afterPropertiesSet() throws Exception {
//      System.out.println("properties set");
//		
//	}
	
}
