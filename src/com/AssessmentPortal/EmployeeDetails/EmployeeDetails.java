package com.AssessmentPortal.EmployeeDetails;

public class EmployeeDetails {
	private String username;
	private String passWord;
	private String fullName;
	
	
public EmployeeDetails(String username, String passWord) {
		
		this.username = username;
		this.passWord = passWord;
		
	}

	public EmployeeDetails(String username, String passWord, String fullName) {
		
		this.username = username;
		this.passWord = passWord;
		this.fullName = fullName;
	}

	
	
	
	public EmployeeDetails() {
		
		// TODO Auto-generated constructor stub
	}




	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	

}
