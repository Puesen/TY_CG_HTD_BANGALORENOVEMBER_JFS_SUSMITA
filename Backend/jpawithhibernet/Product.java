package com.capgimini.javawithhibernete.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity

@Table(name="Product_info")

public class Product {
	@Id
	@Column
	private int pid;
	@Column
	private String name;
	

	

	
}
