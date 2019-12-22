package com.cap.shop.admin.bean;

public class FlipkartBean {
		private int ProductId;
		private String ProductName;
		private double ProductCost;
		private String ProductColor;
		private String Description;
		private int NumOfProd;
		public int getProductId() {
			return ProductId;
		}
		public void setProductId(int productId) {
			ProductId = productId;
		}
		public String getProductName() {
			return ProductName;
		}
		public void setProductName(String productName) {
			ProductName = productName;
		}
		public double getProductCost() {
			return ProductCost;
		}
		public void setProductCost(double productCost) {
			ProductCost = productCost;
		}
		public String getProductColor() {
			return ProductColor;
		}
		public void setProductColor(String productColor) {
			ProductColor = productColor;
		}
		public String getDescription() {
			return Description;
		}
		public void setDescription(String description) {
			Description = description;
		}
		public int getNumOfProd() {
			return NumOfProd;
		}
		public void setNumOfProd(int numOfProd) {
			NumOfProd = numOfProd;
		}
		@Override
		public String toString() {
			return "FlipkartBean [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductCost="
					+ ProductCost + ", ProductColor=" + ProductColor + ", Description=" + Description + ", NumOfProd="
					+ NumOfProd + "]";
		}
		
		
		

}
