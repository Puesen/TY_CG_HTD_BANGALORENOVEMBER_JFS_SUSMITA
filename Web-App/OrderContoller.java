package com.capgimini.Web.App.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgimini.Web.App.dto.Order;
import com.capgimini.Web.App.dto.OrderResponce;
import com.capgimini.Web.App.service.OrderService;

@RestController
@CrossOrigin(origins="*", allowedHeaders="*", allowCredentials="true" )

public class OrderContoller {
	OrderService service;
	private OrderResponce response;
	
	@GetMapping(path="/search-order",produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderResponce getOrder(@RequestParam("id") int id) {
		OrderResponce response = new OrderResponce();
		Order bean = service.searchOrder(id);
		if (bean == null) {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Record with perticuler id does'nt exit");

		} else {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription(" Product found");

		}
		return response;
	}


}
