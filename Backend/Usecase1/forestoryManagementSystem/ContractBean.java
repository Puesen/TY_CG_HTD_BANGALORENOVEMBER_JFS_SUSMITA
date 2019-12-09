package com.capgimini.fms.beans;

public class ContractBean {
	private int contractno;
    private int custid;
    private int haulid; 
    private int deliverydate;
    private String deliveryday;
    private int quantity;
	public int getContractno() {
		return contractno;
	}
	public void setContractno(int contractno) {
		this.contractno = contractno;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public int getHaulid() {
		return haulid;
	}
	public void setHaulid(int haulid) {
		this.haulid = haulid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getDeliverydate() {
		return deliverydate;
	}
	public void setDeliverydate(int deliverydate) {
		this.deliverydate = deliverydate;
	}
	public String getDeliveryday() {
		return deliveryday;
	}
	public void setDeliveryday(String deliveryday) {
		this.deliveryday = deliveryday;
	}
	@Override
	public String toString() {
		return "ContractBean [contractno=" + contractno + ", custid=" + custid + ", haulid=" + haulid  + ", quantity=" + quantity + ", deliverydate=" + deliverydate + ", deliveryday=" + deliveryday
				+ "]";
	}


}
