


package com.capgimini.forestrymanagementjdbc.admin.contract;

import java.util.Date;

//create one class
public class ContractBean {
	//declare and initialize variables
	private  long contractno;
    private String customerid;
    private String productid;
    private String haulierid;
    private String deliverydate;
    private String deliveryday;
    private String quantity;
	/**+
	 * @return the contractno
	 */
	public  long getContractno() {
		return contractno;
	}
	/**
	 * @param contractno2 the contractno to set
	 */
	public void setContractno(long contractno2) {
		this.contractno = contractno2;
	}
	/**
	 * @return the customerid
	 */
	public String getCustomerid() {
		return customerid;
	}
	/**
	 * @param customerid2 the customerid to set
	 */
	public void setCustomerid(String customerid2) {
		this.customerid = customerid2;
	}
	/**
	 * @return the haulierid
	 */
	public String getProductid() {
		return productid;
	}
	/**
	 * @param productid the productid to set
	 */
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getHaulierid() {
		return haulierid;
	}
	/**
	 * @param haulierid2 the haulierid to set
	 */
	public void setHaulierid(String haulierid2) {
		this.haulierid = haulierid2;
	}
	/**
	 * @return the productid
	 */
	
	public String getDeliverydate() {
		return deliverydate;
	}
	/**
	 * @param deliverydate2 the deliverydate to set
	 */
	public void setDeliverydate(String deliverydate2) {
		this.deliverydate = deliverydate2;
	}
	/**
	 * @return the deliveryday
	 */
	public String getDeliveryday() {
		return deliveryday;
	}
	/**
	 * @param deliveryday the deliveryday to set
	 */
	public void setDeliveryday(String deliveryday) {
		this.deliveryday = deliveryday;
	}
	/**
	 * @return the quantity
	 */
	public String getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the deliverydate
	 */
	@Override
	public String toString() {
		return "ContractBean [contractno=" + contractno + ", customerid=" + customerid + ", productid=" + productid
				+ ", haulierid=" + haulierid + ", deliverydate=" + deliverydate + ", deliveryday=" + deliveryday
				+ ", quantity=" + quantity + "]";
	}
	
	//override toString method
	
}//end of class
