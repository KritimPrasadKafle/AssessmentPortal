package com.AssessmentPortal.Executor;
import java.util.Scanner;

import com.AssessmentPortal.AssessmentQuestion.AssessmentQuestion;
import com.AssessmentPortal.EmployeeDetails.EmployeeDetails;
public class AssessmentPortalExecutor {

   public static void main(String[] args)
   {
	   String userName;
	   String password;
	   String userFullname;
	   boolean flag;
	   
	   Scanner sc=new Scanner(System.in);
	   do {
	   System.out.println("1.Login");
	   System.out.println("2.Register");
	   int num;
	   num=sc.nextInt();
	   switch(num) {
	   case 1:
		   System.out.println("Enter userName:");
		   userName=sc.next();
		   System.out.println("Enter password:");
		   password=sc.next();
<<<<<<< HEAD
		  
		   EmployeeDetails empDetails=new EmployeeDetails(userName,password);
		   EmployeeCredentials validate=new EmployeeCredentials();
		   EmployeeDetails empdetails=validate.validateEmployee(empDetails);
		   if(empdetails!=null)
		   {
			   
			   AssessmentQuestion question=new AssessmentQuestion();
			   question.showAssessment(empdetails);
=======
		   
		   EmployeeDetails empDetails=new EmployeeDetails(userName,password);
		   EmployeeCredentials validate=new EmployeeCredentials();
		   AssessmentQuestion assessmentQuestion = new AssessmentQuestion();
		   if(validate.validateEmployee(empDetails)!=null)
		   {
			   assessmentQuestion.showAssessment();
>>>>>>> c930f2a9d1b88e9cc8cbf56be1fc33a25d3a082c
		   }
		   else
		   {
			   System.out.println("Please enter valid credentials");
		   }
		   break;
	   case 2:
		   System.out.println("Enter userName:");
		   userName=sc.next();
		   System.out.println("Enter password:");
		   password=sc.next();
		   System.out.println("Enter your fullName:");
		   userFullname=sc.next();
		   EmployeeDetails details=new EmployeeDetails(userName,password,userFullname);
		   EmployeeCredentials addEmployee=new EmployeeCredentials();
		   addEmployee.addEmployeeDetails(details);
		   break;
	   }
	   System.out.println("Do u want to continue [y/n]");
	   char choice=sc.next().charAt(0);
	   if(choice=='y')
	   {
		   flag=true;
	   }
	   else
	   {
		   flag=false;
	   }
	   
	   
	   }while(flag);
	   sc.close();
	   
   }
   

}
