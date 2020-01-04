


package com.capgimini.forestrymanagement1.admin.contract;
//create one class
public class ContractBean {
	//declare and initialize variables
	private  Long contractno;
    private String customerid;
    private String haulierid;
    private String productid;
    private String quantity;
    private String deliverydate;
    private String deliveryday;
	/**+
	 * @return the contractno
	 */
	public  Long getContractno() {
		return contractno;
	}
	/**
	 * @param contractno2 the contractno to set
	 */
	public void setContractno(Long contractno2) {
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
	public String getProductid() {
		return productid;
	}
	/**
	 * @param productid the productid to set
	 */
	public void setProductid(String productid) {
		this.productid = productid;
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
	//override toString method
	@Override
	public String toString() {
		return "ContractBean [contractno=" + contractno + ", customerid=" + customerid + ", haulierid=" + haulierid
				+ ", productid=" + productid + ", quantity=" + quantity + ", deliverydate=" + deliverydate
				+ ", deliveryday=" + deliveryday + "]";
	}
    
}//end of class
