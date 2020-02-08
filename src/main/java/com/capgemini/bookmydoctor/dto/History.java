package com.capgemini.bookmydoctor.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "history_info")
public class History {

	@Id
	@Column
	@GeneratedValue
	private int historyId;
	
	@Column
	private int eventById;
	
	@Column
	private String eventByName;
	
	@Column
	private int eventFor;
	
	@Column
	private String operation;

	@Column
	private String dateAndTime;

	public int getHistoryId() {
		return historyId;
	}

	public void setHistoryId(int historyId) {
		this.historyId = historyId;
	}

	public int getEventById() {
		return eventById;
	}

	public void setEventById(int eventById) {
		this.eventById = eventById;
	}

	public String getEventByName() {
		return eventByName;
	}

	public void setEventByName(String eventByName) {
		this.eventByName = eventByName;
	}

	public int getEventFor() {
		return eventFor;
	}

	public void setEventFor(int eventFor) {
		this.eventFor = eventFor;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}


	
}
