package com.capgimini.Web.App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgimini.Web.App.dto.Product;
import com.capgimini.Web.App.dto.ProductResponce;
import com.capgimini.Web.App.service.ProductService;

@RestController
@CrossOrigin(origins="*", allowedHeaders="*", allowCredentials="true" )
public class ProductController {
	@Autowired
	ProductService service;
	private ProductResponce response;
	
	@PostMapping(path="/add-product",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponce addProduct(@RequestBody Product product) {
		ProductResponce response=new ProductResponce();
		if(service.addProduct(product)) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("Product added Successfully...");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Product id already Exists!!!");
		}
		return response;
	}
	@GetMapping(path="/search-product",produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponce searchProduct(@RequestParam("id") int id) {
		ProductResponce response = new ProductResponce();
		Product bean = service.searchProduct(id);
		if (bean == null) {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Record with particuler id does not exit");

		} else {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription(" Product found");

		}
		return response;
	}
}
