package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.Animal;
import com.capgemini.springcore.beans.Hello;
import com.capgemini.springcore.beans.Pet;
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       Hello hello=context.getBean(Hello.class);
       Hello hello2=context.getBean(Hello.class);
       System.out.println("--------------");
       System.out.println(hello==hello2);
       System.out.println("---------------");
       
       System.out.println(hello);
       System.out.println(hello2);
       
       System.out.println(hello.getMessage());
       System.out.println(hello.getCount());
       //hello.setcount(Integer.parseInt("100);
       System.out.println("-----------------");
       Animal animal=context.getBean(Animal.class);//getbean
       //is factory method returns animal tye object
       animal.makeSound();//in beans primary=true is given so more preference to dog
      System.out.println("--------------------------");
      Pet pet=context.getBean(Pet.class);
      System.out.println(pet.getName());
      pet.getAnimal().makeSound();
      
    }
}
