package com.capgimini.empspring1.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee_info")
public class EmployeeBean {
	@Id
	@Column
	@GeneratedValue

	private int id;
	@Column
	private String name;
	@Column(unique=true, nullable=false)
	private String email;
	@Column
	private String password;
	@OneToMany(cascade =CascadeType.ALL, mappedBy= "bean")
	private List<EmployeeAddressBean> addressBeans;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the addressBeans
	 */
	public List<EmployeeAddressBean> getAddressBeans() {
		return addressBeans;
	}
	/**
	 * @param addressBeans the addressBeans to set
	 */
	public void setAddressBeans(List<EmployeeAddressBean> addressBeans) {
		this.addressBeans = addressBeans;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
}
