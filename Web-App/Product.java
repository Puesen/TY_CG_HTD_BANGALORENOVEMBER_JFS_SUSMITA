package com.capgimini.Web.App.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import antlr.collections.List;
import lombok.Data;

@Data
@Entity
@Table(name="ProductInfo")
public class Product {
	
	@Id
	@Column
	@GeneratedValue
	private int id;	
	@Column(unique=true,nullable=false)
	private String name;
	@Column(nullable=false)
	private int quentity;
	@Column(nullable=false)
	private String details;

//	@ManyToOne(cascade =CascadeType.ALL)
//	@JoinColumn(name="user_id", referencedColumnName= "id")
//	private User user;
	
}
