package com.capgimini.contact.bean;

public class Contactbean {
	private int name;
    private int number;
    private int group;
    
    	public int getName() {
		return name;
	}


	public void setName(int name) {
		this.name = name;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public int getGroup() {
		return group;
	}


	public void setGroup(int group) {
		this.group = group;
	}


	@Override
	public String toString() {
		return "Contactbean [name=" + name + ", number=" + number + ", group=" + group + "]";
	}


}
