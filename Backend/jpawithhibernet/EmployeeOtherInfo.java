package com.capgimini.mapping.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Emp_otherinfo")
public class EmployeeOtherInfo {
	@Id
	@Column
	private int id;
	@Column
	private String pancard;
	@Column
	private String fname;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	private EmployeeInfo empInfo;
	

}
