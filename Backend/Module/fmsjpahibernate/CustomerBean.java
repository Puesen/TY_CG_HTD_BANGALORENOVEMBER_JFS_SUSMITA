package com.capgimini.fmsjpahibernate.dto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Customer")

//create one class
public class CustomerBean {
	//declare and initialized variables 
	@Id
	@Column(name="customerid")	
	private  int customerid;
	@Column(name="customername")
    private String customername;
	@Column(name="streetAddress1")
    private String streetAddress1;
	@Column(name="streetAddress2")
    private String streetAddress2;
	@Column(name="town")
    private String town;
	@Column(name="postalCode")
    private String postalCode;
	@Column(name="email")
    private String email;
	@Column(name="telephoneNo")
    private String telephoneNo;
    
	//Override toString method 
	@Override
	public String toString() {
		return "CustomerBean [customerid=" + customerid + ", customername=" + customername + ", streetAddress1="
				+ streetAddress1 + ", streetAddress2=" + streetAddress2 + ", town=" + town + ", postalCode="
				+ postalCode + ", email=" + email + ", telephoneNo=" + telephoneNo + "]";
	}//end of toString
	
    
}//end of class
