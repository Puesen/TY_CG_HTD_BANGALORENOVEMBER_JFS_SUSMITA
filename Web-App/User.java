package com.capgimini.Web.App.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name="UserInfo")
public class User {
	
	@Id
	@Column
	@GeneratedValue
	private int id;	
	@Column(nullable=false)
	private String name;
	@Column(unique=true,nullable=false)
	private String email;
	@Column(nullable=false)
	private String password;
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
//	private List<Order> order;



}
