package com.cap.shop.admin.service.dao;

import java.util.List;

import com.cap.shop.admin.bean.FlipkartBean;

public interface FlipkartServiceDAO {

	public abstract boolean buy(FlipkartBean ProductId);
	public abstract boolean search(FlipkartBean ProductId);

}
