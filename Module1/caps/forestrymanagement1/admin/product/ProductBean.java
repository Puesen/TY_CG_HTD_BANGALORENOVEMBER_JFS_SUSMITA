package com.caps.forestrymanagement1.admin.product;

public class ProductBean {
	 private int prodid;
	    private String pname;
	    private int pqnty;
		
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
		public int getPqnty() {
			return pqnty;
		}
		public void setPqnty(int pqnty) {
			this.pqnty = pqnty;
		}
		@Override
		public String toString() {
			return "ProductBean [prodid=" + prodid + ", pname=" + pname + ", pqnty=" + pqnty + "]";
		}
	    
}
