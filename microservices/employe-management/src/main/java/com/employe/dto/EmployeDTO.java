package com.employe.dto;


public class EmployeDTO {
    private Long employeId;
	public Long getEmployeId() {
		return employeId;
	}

	public void setEmployeId(Long employeId) {
		this.employeId = employeId;
	}

	private String employeName;
	
	private String employeAddress;
	
	public Long employeNumber;
	
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

	public String getEmployeAddress() {
		return employeAddress;
	}

	public void setEmployeAddress(String employeAddress) {
		this.employeAddress = employeAddress;
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

}
