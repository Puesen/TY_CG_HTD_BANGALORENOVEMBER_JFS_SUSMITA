package com.capgimini.springrest.dto;

import java.util.List;

import com.capgimini.springrest.beans.EmployeeBean;

public class EmployeeResponce {

	private int statusCode;
	private String message;
	private String description;
	private List<EmployeeBean> beans;
	/**
	 * @return the statusCode
	 */
	public int getStatusCode() {
		return statusCode;
	}
	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the beans
	 */
	public List<EmployeeBean> getBeans() {
		return beans;
	}
	/**
	 * @param beans the beans to set
	 */
	public void setBeans(List<EmployeeBean> beans) {
		this.beans = beans;
	}
	
	
}
