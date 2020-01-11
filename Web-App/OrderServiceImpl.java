package com.capgimini.Web.App.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgimini.Web.App.dao.OrderDAO;
import com.capgimini.Web.App.dto.Order;


@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	 private OrderDAO dao;

	@Override
	public Order searchOrder(int id) {
		return dao.searchOrder(id);
	}

}
