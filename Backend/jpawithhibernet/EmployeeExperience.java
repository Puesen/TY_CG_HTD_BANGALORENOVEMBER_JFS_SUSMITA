package com.capgimini.mapping.manytoone;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.capgimini.mapping.onetoone.EmployeeInfo;

import lombok.Data;
@Data
@Entity
@Table(name="EmployeeExperience")
public class EmployeeExperience {
	@Id
	@Column
	private int expid;
	@Column
	private String cname;
	@Column
	private int noOfYear;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	private EmployeeInfo empInfo;
	

}
