package com.capgimini.fmsjpahibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="contract")

public class ContractBean {
	@Id
	@Column(name="contractid")
	private long contractno;
	@Column(name="Customerid")
	private String Customerid;
	@Column(name="Productid")
	private String Productid;
	@Column(name="Haulierid")
	private String Haulierid;
	@Column(name="DeliveryDate")
	private String DeliveryDate;
	@Column(name="DeleveryDay")
	private String DeleveryDay;
	@Column(name="Quantity")
	private String Quantity;
	@Override
	public String toString() {
		return "contract [contractid=" + contractno + ", Customerid=" + Customerid + ", Productid=" + Productid
				+ ", Haulierid=" + Haulierid + ", DeliveryDate=" + DeliveryDate + ", DeleveryDay=" + DeleveryDay
				+ ", Quantity=" + Quantity + "]";
	}
	
	
}