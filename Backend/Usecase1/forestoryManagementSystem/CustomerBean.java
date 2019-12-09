package com.capgimini.fms.beans;

public class CustomerBean {
	private int id;
	private String name;
	private String address1;
	private String address2;
	private String town;
	private int postalcode;
	private String emailid;
	private long telephoneno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public int getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(int postalcode2) {
		this.postalcode = postalcode2;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public long getTelephoneno() {
		return telephoneno;
	}
	public void setTelephoneno(long telephone) {
		this.telephoneno = telephone;
	}
	@Override
	public String toString() {
		return "CustomerBean [id=" + id + ", name=" + name + ", address1=" + address1 + ", address2=" + address2
				+ ", town=" + town + ", postalcode=" + postalcode + ", emailid=" + emailid + ", telephoneno="
				+ telephoneno + "]";
	}
	
	
	

}
