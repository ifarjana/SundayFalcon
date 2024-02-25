package com.upskill.java_2;

public class Loops {

	/*
	Types of Loops
		1. For loop
		2. while Loop
		3. Do while loop
		4. Infinite loop 
	 */
	
	//For Loop
	public static void main(String[] args) {
//			practiceForLoop();
//			practiceWhileLoop();
//			practiceDoWhileLoop();
//			practiceInfiniteLoop();
//			practiceNestedForLoop();
		
	}
	
	//For Loop
	public static void practiceForLoop() {						//For Loop - Do again and again up to upper limit
		int i;													//Initialize the variable
		for (i = 1; i <= 10; i++){								//Setting lower limit, upper limit, increment or decrement
			System.out.println("For Loops number =" + i);		//Statement
		}
	}
	
	//While Loop
	public static void practiceWhileLoop() {					//While Loop - Do again and again up to condition match
		int i = 1;												//Initialize the variable
		while(i <= 0){											//Setting Condition
			System.out.println("while loops number =" + i);		//Statement
			i++;												//Increment or Decrement
		}
	}
	
	//Do While Loop
	public static void practiceDoWhileLoop() {					//Do While Loop - Do action then match condition
		int i = 1;												//Initialize the variable
		do {													
			System.out.println("Do while loops number =" + i);	//Statement
			i++;												//Increment or Decrement
		} while(i<=0);											//Checking condition
	}
	
	//Infinite Loop
	public static void practiceInfiniteLoop() {					//Infinite Loop - never ending loop
		int i;													//Initialize the variable
		for (i = 1; ; i++){										//Setting no upper limit
			System.out.println("For Loops number =" + i);		//Statement
		}
	}
	
	//Nested Loop
	public static void practiceNestedForLoop() {
		int i;
		int j;
		for (i = 1; i <=10; i++) {
			for (j = 1; j <=10; j++) {
				int multipicationTable = i * j;
				System.out.println(multipicationTable + " ");		
		}
		System.out.print(" ");
		}
	}
}

