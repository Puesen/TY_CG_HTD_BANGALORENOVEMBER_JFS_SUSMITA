package com.caps.forestrymanagement1.admin.contract;

public class ContractBean {
	private  int contractno;
    private int customerid;
    private int haulierid;
    private int productid;
    private int quantity;
    private String deliverydate;
    private String deliveryday;
	/**+
	 * @return the contractno
	 */
	public  int getContractno() {
		return contractno;
	}
	/**
	 * @param contractno the contractno to set
	 */
	public void setContractno(int contractno) {
		this.contractno = contractno;
	}
	/**
	 * @return the customerid
	 */
	public int getCustomerid() {
		return customerid;
	}
	/**
	 * @param customerid the customerid to set
	 */
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	/**
	 * @return the haulierid
	 */
	public int getHaulierid() {
		return haulierid;
	}
	/**
	 * @param haulierid the haulierid to set
	 */
	public void setHaulierid(int haulierid) {
		this.haulierid = haulierid;
	}
	/**
	 * @return the productid
	 */
	public int getProductid() {
		return productid;
	}
	/**
	 * @param productid the productid to set
	 */
	public void setProductid(int productid) {
		this.productid = productid;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the deliverydate
	 */
	public String getDeliverydate() {
		return deliverydate;
	}
	/**
	 * @param deliverydate the deliverydate to set
	 */
	public void setDeliverydate(String deliverydate) {
		this.deliverydate = deliverydate;
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
	@Override
	public String toString() {
		return "ContractBean [contractno=" + contractno + ", customerid=" + customerid + ", haulierid=" + haulierid
				+ ", productid=" + productid + ", quantity=" + quantity + ", deliverydate=" + deliverydate
				+ ", deliveryday=" + deliveryday + "]";
	}
    
}
