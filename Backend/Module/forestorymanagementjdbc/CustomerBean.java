package com.capgimini.forestrymanagementjdbc.admin.customer;
//create one class
public class CustomerBean {
	//declare and initialized variables 
	private  int customerid;
    private String customername;
    private String streetAddress1;
    private String streetAddress2;
    private String town;
    private String postalCode;
    private String email;
    private String telephoneNo;
    //create getter and setter methods of all the variables
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
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode2) {
		this.postalCode = postalCode2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephoneNo() {
		return telephoneNo;
	}
	public void setTelephoneNo(String telephoneno2) {
		this.telephoneNo = telephoneno2;
	}
	
	//Override toString method 
	@Override
	public String toString() {
		return "CustomerBean [contractid=" + customerid + ", customername=" + customername + ", streetAddress1="
				+ streetAddress1 + ", streetAddress2=" + streetAddress2 + ", town=" + town + ", postalCode="
				+ postalCode + ", email=" + email + ", telephoneNo=" + telephoneNo + "]";
	}//end of toString
	
    
}//end of class
