package com.capgimini.forestrymanagement1.admin.product;
//create one class ProductBean
public class ProductBean {
	//declare and initialize variables in product bean class
	private int prodid;
    private String pname;
    private String pdesc;
    //getter and setter methods
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	//Override toString class
	@Override
	public String toString() {
		return "ProductBean [prodid=" + prodid + ", pname=" + pname + ", pdesc=" + pdesc + "]";
	}
	  
}//End of class
