package com.AssessmentPortal.Executor;

import com.AssessmentPortal.AssessmentQuestion.AssessmentQuestion;
import com.AssessmentPortal.EmployeeDetails.EmployeeDetails;

//import com.AssessmentPortal.EmployeeDetails.EmployeeDetails;

public class EmployeeMarksDetails {
	private String fullName;
	private double marks;
	EmployeeDetails employeeDetails= new EmployeeDetails();
	AssessmentQuestion assessmentQuestion = new AssessmentQuestion();
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public EmployeeMarksDetails(String fullName, double d) {
		
		this.fullName = fullName;
		this.marks = d;
	}
	public EmployeeMarksDetails() {
		
	}
	@Override
	public String toString() {
		return "EmployeeMarksDetails [fullName=" + employeeDetails.getUsername() + ", marks=" + assessmentQuestion.getPercentage() + "]";
	}
	
	
	
	
	

}
