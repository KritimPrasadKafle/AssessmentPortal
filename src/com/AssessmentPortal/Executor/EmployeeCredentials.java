package com.AssessmentPortal.Executor;

import java.util.ArrayList;

import com.AssessmentPortal.EmployeeDetails.EmployeeDetails;

public class EmployeeCredentials {
   public static ArrayList<EmployeeDetails> employeeDetails;
   static {
	   employeeDetails = new ArrayList<>();
	   employeeDetails.add(new EmployeeDetails("Kritim", "1234", "KritimKafle"));
	   
   }
   EmployeeDetails employee;
   public EmployeeCredentials()
   {
	   
   }
   EmployeeDetails validateEmployee(EmployeeDetails employee)
   {
	   for(EmployeeDetails emp:employeeDetails)
	   {
		   if((emp.getUsername().equals(employee.getUsername())) && 
				   (emp.getPassWord().equals(employee.getPassWord()))){
			   return emp;
		   }
	   }
	   return null;
   }
   void addEmployeeDetails(EmployeeDetails employee)
   {
	   employeeDetails.add(employee);
   }
}
