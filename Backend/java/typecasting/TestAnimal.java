package com.tyss.typecasting.pack2;

public class TestAnimal {
public static void main(String[] args) {
	Animal a1=new Animal();
    a1.eat();
    System.out.println("-------------");
    Animal a2=new Dog();
    a2.eat();
    a2.walk();
    System.out.println("-----------");
    
    Animal a3= new Lion();
    Lion l1 =(Lion)a3;
    l1.eat();
    l1.run();

}
}
