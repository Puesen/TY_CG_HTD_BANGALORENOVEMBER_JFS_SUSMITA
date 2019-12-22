package com.cap.shop.admin.dao;

import java.util.List;

import com.cap.shop.admin.bean.FlipkartBean;



public interface FlipkartDAO {

	public abstract List<FlipkartBean> getAllProducts();
	public abstract boolean search(FlipkartBean ProductId);

}
