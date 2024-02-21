package com.AssessmentPortal.AssessmentQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AssessmentQuestion {
	
	
	public static Map<Integer,String> enteredAnswer;
	public static Map<Integer,String> actualAnswer;
	
	
	
	static {
	actualAnswer.put(1,"a");
	
	actualAnswer.put(2,"b");
	
	actualAnswer.put(3,"c");
	
	actualAnswer.put(4,"b");
	actualAnswer.put(5,"b");
	actualAnswer.put(6,"b");
	actualAnswer.put(7,"b");
	actualAnswer.put(8,"b");
	actualAnswer.put(9,"b");
	actualAnswer.put(10,"b");
	
	
	}
	
	
	
	public void showAssessment() {
		
	System.out.println("Here is your Assessment Questions");
	Scanner scanner = new Scanner(System.in);
	int score = 0;
	
	System.out.println("Question 1: Which of the following is the correct way to declare and initialize an array in Java?");
    System.out.println("a) int array = {1, 2, 3};");
    System.out.println("b) int[] array = new int[]{1, 2, 3};");
    System.out.println("c) int array = new int[3]{1, 2, 3};");
    System.out.println("d) int array[] = {1, 2, 3};");
    System.out.print("Your answer: ");
    String answer1 = scanner.next();
    enteredAnswer.put(1, answer1);
    
	
    
    System.out.println("\nQuestion 2: What is the purpose of the 'static' keyword in Java?");
    System.out.println("a) It indicates that a variable is constant.");
    System.out.println("b) It allows a method to be called without creating an instance of the class.");
    System.out.println("c) It specifies that a variable belongs to an instance of the class.");
    System.out.println("d) It is used to declare a variable with a fixed value.");
    System.out.print("Your answer: ");
    String answer2 = scanner.next();
    enteredAnswer.put(2, answer2);
    
	
    
    System.out.println("\nQuestion 3: Which of the following is true about the break statement in Java?");
    System.out.println("a) It is used to terminate the program.");
    System.out.println("b) It is used to exit a loop or switch statement.");
    System.out.println("c) It is used to skip the rest of the code in a method.");
    System.out.println("d) It is used to declare a label.");
    System.out.println("Your answer: ");
    String answer3 = scanner.next();
    enteredAnswer.put(3, answer3);
    
    
    
    System.out.println("\nQuestion 4:What is the output of the following code snippet?");
    String str1 = "Hello";
    String str2 = "World";
    System.out.println("System.out.println(str1.concat(str2))");
    System.out.println("a) Hello World");
    System.out.println("b) Hello.concat(World)");
    System.out.println("c) str1.str2");
    System.out.println("d) str1 + str2");
    String answer4 = scanner.next();
    enteredAnswer.put(4, answer4);
    
    
    
	System.out.println("\nQuestion 5 : What is the output of the following code snippet?");
	String str = "Java";
	String str12 = "Programming";
	System.out.println("System.out.println(str1.length() + str2.length())");
	System.out.println("a) 13");
	System.out.println("b) 12");
	System.out.println("c) JavaProgramming");
	System.out.println("d) str1.length() + str2.length()");
	String answer5 = scanner.next();
	enteredAnswer.put(5, answer5);
	
	System.out.println("\nQuestion 6 : What is the output of the following code snippet?");
	int x = 7;
	int y = 3;
	System.out.println("System.out.println(x / y + \" remainder \" + x % y)");
	System.out.println("a) 2 remainder 1");
	System.out.println("b) 2.33 remainder 1");
	System.out.println("c) 2 remainder 0");
	System.out.println("d) 2.33 remainder 0");
	String answer6 = scanner.next();
	enteredAnswer.put(6, answer6);
	
	
	System.out.println("\nQuestion 7 : What is the output of the following code snippet?");
	boolean flag1 = true;
	boolean flag2 = false;
	System.out.println("System.out.println(!flag1 || flag2)");
	System.out.println("a) true");
	System.out.println("b) false");
	System.out.println("c) !flag1 || flag2");
	System.out.println("d) true false");
	String answer7 = scanner.next();
	enteredAnswer.put(7, answer7);

	
	System.out.println("\nQuestion 8 : What is the output of the following code snippet?");
	int[] numbers = {1, 2, 3, 4, 5};
	System.out.println("System.out.println(numbers[2])");
	System.out.println("a) 1");
	System.out.println("b) 2");
	System.out.println("c) 3");
	System.out.println("d) 4");
	String answer8 = scanner.next();
	enteredAnswer.put(8, answer8);

	
	System.out.println("\nQuestion 9 : What is the output of the following code snippet?");
	String str13 = "Hello, World!";
	System.out.println("System.out.println(str.substring(0, 5))");
	System.out.println("a) Hello");
	System.out.println("b) World");
	System.out.println("c) Hello,");
	System.out.println("d) Hello, World!");
	String answer9 = scanner.next();
	enteredAnswer.put(9, answer9);
	
	System.out.println("\nQuestion 10 : What is the output of the following code snippet?");
	double radius = 5.0;
	System.out.println("System.out.println(\"The area of the circle: \" + Math.PI * Math.pow(radius, 2))");
	System.out.println("a) The area of the circle: 78.54");
	System.out.println("b) The area of the circle: 50.27");
	System.out.println("c) The area of the circle: " + Math.PI * Math.pow(radius, 2));
	System.out.println("d) The area of the circle: radius * radius");
	String answer10 = scanner.next();
	enteredAnswer.put(10, answer10);

    for(Integer map:actualAnswer.keySet())
    {
    	if(actualAnswer.get(map).equals(enteredAnswer.get(map)))
    	{
    		score++;
    	}
    }
    int percentage=(score/10)*100;
    System.out.println("Your marks: "+percentage+"%");
    
	}
	
    		


}