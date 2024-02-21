package com.AssessmentPortal.Executor;

import java.util.ArrayList;

import com.AssessmentPortal.EmployeeDetails.EmployeeDetails;

public class EmployeeCredentials {
   static public ArrayList<EmployeeDetails> employeeDetails=new ArrayList<>();
   static {
	   EmployeeDetails emp1=new EmployeeDetails("Nivetha","123","Nivetha");
	   employeeDetails.add(emp1);
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
