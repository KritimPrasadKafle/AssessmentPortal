package com.AssessmentPortal.Executor;

import java.util.ArrayList;

import com.AssessmentPortal.EmployeeDetails.EmployeeDetails;

public class EmployeeCredentials {
   public static ArrayList<EmployeeDetails> employeeDetails;
   static {
<<<<<<< HEAD
	   EmployeeDetails emp1=new EmployeeDetails("Nivetha","123","Nivetha");
	   employeeDetails.add(emp1);
=======
	   employeeDetails = new ArrayList<>();
	   employeeDetails.add(new EmployeeDetails("Kritim", "1234", "KritimKafle"));
	   
>>>>>>> c930f2a9d1b88e9cc8cbf56be1fc33a25d3a082c
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
