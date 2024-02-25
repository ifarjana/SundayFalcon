package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType{

/* Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/
	
	public static void main(String[] args) {
		car(1, 3);
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();
	}
	
	//Method Overriding - Rumtime Polymorphism - Dynamic binding
	//Same Method name from Parent class to overrides
	
	public void annualIncomeVoid() {
		int calculateAnnualIncome = hourlyIncome * 2000;
		int rentalIncome = 15000;
		int sideHussel = 25000;
		int newCalculateAnnualIncome = calculateAnnualIncome + rentalIncome + sideHussel;
		System.out.println("My annual Income = " + newCalculateAnnualIncome);
	}
	
	//Method Overloading - Complie time Polymorphism - Static binding
	//Same method name with diffderent signature
	
	public static void car() {
		System.out.println("My car is a Tesla !");
	}
	
	public static void car(int door) {
		System.out.println("My car is a Tesla !, it has door : " + door);
	}
	
	public static void car(String color) {
		System.out.println("My car is a Tesla !, it has color : " + color);
	}
	
	public static void car(Boolean dualMotor) {
		System.out.println("My car is a Tesla ! it has dualMotor : " + dualMotor);
	}
	
	public static void car(int seat, String bodyType) {
		System.out.println("My car is a Tesla ! it has seat : " + seat + "it has bodyType : " + bodyType);
	}
	
	public static void car(int steeringwheel, int mirror) {
		System.out.println("my car is a Tesla ! it has wheel : " + steeringwheel + "it has mirror : " + mirror);
	}
}

