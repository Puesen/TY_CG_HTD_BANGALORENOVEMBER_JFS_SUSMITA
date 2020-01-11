package com.capgimini.Web.App.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="OrderInfo")
public class Order {
	
	@Id
	@Column
	@GeneratedValue
	private int id;	

//	@ManyToOne(cascade =CascadeType.ALL)
//	@JoinColumn(name="user_id", referencedColumnName= "id")
//	private User user;
//	
//	
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
//	private List<Product> product;

	
	
}
