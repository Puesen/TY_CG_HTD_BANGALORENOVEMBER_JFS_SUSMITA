
package com.capgimini.Web.App.dto;

import java.util.List;

import lombok.Data;
@Data

public class ProductResponce {

	private int statusCode;
	private String message;
	private String description;
	private List<Product> user;
	
}
