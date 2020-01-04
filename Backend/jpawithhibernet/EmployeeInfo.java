package com.capgimini.mapping.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode.Exclude;
@Data
@Entity
@Table(name="Employee_info")
public class EmployeeInfo {
	@Id
	@Column
	private int eid;
	@Column
	private String ename;
	@Column
	private String email;
	@Column
	private String password;
	
	@Exclude
	@OneToOne(cascade=CascadeType.ALL, mappedBy="empInfo")
	private EmployeeOtherInfo other;

}
