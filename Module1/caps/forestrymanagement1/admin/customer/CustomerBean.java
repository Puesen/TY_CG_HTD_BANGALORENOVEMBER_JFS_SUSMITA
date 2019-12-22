package com.caps.forestrymanagement1.admin.customer;

public class CustomerBean {
	private  int customerid;
    private String customername;
    private String streetAddress1;
    private String streetAddress2;
    private String town;
    private int postalCode;
    private String email;
    private long telephoneNo;
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getStreetAddress1() {
		return streetAddress1;
	}
	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}
	public String getStreetAddress2() {
		return streetAddress2;
	}
	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getTelephoneNo() {
		return telephoneNo;
	}
	public void setTelephoneNo(long telephoneno2) {
		this.telephoneNo = telephoneno2;
	}
	@Override
	public String toString() {
		return "CustomerBean [contractid=" + customerid + ", customername=" + customername + ", streetAddress1="
				+ streetAddress1 + ", streetAddress2=" + streetAddress2 + ", town=" + town + ", postalCode="
				+ postalCode + ", email=" + email + ", telephoneNo=" + telephoneNo + "]";
	}
	
    
}
