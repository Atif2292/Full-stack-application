package com.employe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="emplyedb")
public class EmployeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employeId;
	
    public Long getEmployeId() {
		return employeId;
	}

	public void setEmployeId(Long employeId) {
		this.employeId = employeId;
	}

	private String employeName;
	
	private String employeAddress;
	
	private Long employeNumber;
	
	private int employeAge;
	
	public String employeGender ;
	

	public String getEmployeGender() {
		return employeGender;
	}

	public void setEmployeGender(String employeGender) {
		this.employeGender = employeGender;
	}

	public String getEmployeName() {
		return employeName;
	}

	public void setEmployeName(String employeName) {
		this.employeName = employeName;
	}

	public Long getEmployeNumber() {
		return employeNumber;
	}

	public void setEmployeNumber(Long employeNumber) {
		this.employeNumber = employeNumber;
	}

	public int getEmployeAge() {
		return employeAge;
	}

	public void setEmployeAge(int employeAge) {
		this.employeAge = employeAge;
	}

	public String getEmployeAddress() {
		return employeAddress;
	}

	public void setEmployeAddress(String employeAddress) {
		this.employeAddress = employeAddress;
	}
}
