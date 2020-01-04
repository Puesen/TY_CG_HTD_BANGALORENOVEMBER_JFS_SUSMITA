package com.capgemini.springcore.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.capgemini.springcore.beans.Cat;
import com.capgemini.springcore.beans.Dog;
import com.capgemini.springcore.beans.Hello;
import com.capgemini.springcore.beans.Pet;

@Configuration//represets empty beans element after adding dependencyi.e.,emptyclass with configannotation    
public class BeansConfig {
	@Bean("hello")//name of the bean
	@Scope("prototype")//creates each time an object ,is not inside bean another annotation
	public Hello getHello() {
		Hello hello=new Hello();
		hello.setMessage("I Love choclates");
		hello.setCount(1000);
		return hello;
		
	}
	@Bean//dafault method name will be name/id of bean
	public Dog getDog() {
		return new Dog();
	}
	@Bean("pet")
	public  Pet getPet() {
		Pet pet=new Pet();
		pet.setName("sessor");
		//pet.setAnimal(getDog());
		return pet;
		
	}
	@Bean("cat")
	@Primary//similar to primary=true
	
    public Cat getCat() {
    	return new Cat();
    }
}

//annotation shows error at compile time any changes in code we have to open code modify and runit but not in xml
//dont have primary=true in annotation
//Autowired automatically creates object and wires we do this in particular class where we want variable/object,it can be used for variable,method,constructor
//bytype,byname,constructor not use ,autowire cant be usedfor class