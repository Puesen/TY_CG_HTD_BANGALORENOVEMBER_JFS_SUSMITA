package com.capgemini.springcore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class Author {

	String name;
     
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
