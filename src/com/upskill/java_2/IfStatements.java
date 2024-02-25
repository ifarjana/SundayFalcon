package com.upskill.java_2;

public class IfStatements {

	public static void main(String[] args) {

		int age = 100;
		
		if (age <13 ) {												//conditional statement
			System.out.println("You are a child");
		} else if (age >=13 && age <17) {
			System.out.println("You are a teenager");
		} else if (age >=60) {
			if (age <100) {											//nested if else
				System.out.println("You are a senior");
			} else {
				System.out.println("You are an champion");
			}
		} else {
			System.out.println("You are an adult");
		
		}
		
	}

}



	