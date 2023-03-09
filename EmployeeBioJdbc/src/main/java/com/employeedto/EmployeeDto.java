package com.employeedto;

public class EmployeeDto {
	private String employeeId;
	private String employeeName;
	private String employeeFather;
	private String emailId;
	private String phone;
	private String city;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeFather() {
		return employeeFather;
	}
	public void setEmployeeFather(String employeeFather) {
		this.employeeFather = employeeFather;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) { }
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public EmployeeDto(String employeeId, String employeeName, String employeeFather, String emailId, String phone,
			String city) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeFather = employeeFather;
		this.emailId = emailId;
		this.phone = phone;
		this.city = city;
	}
	public EmployeeDto() {
		// TODO Auto-generated constructor stub
	}
	
}