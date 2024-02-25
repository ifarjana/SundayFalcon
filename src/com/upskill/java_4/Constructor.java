package com.upskill.java_4;

public class Constructor {
	
	/* Constructor is instance of class, method same as class name, java will execute constructor first
	 - Constructor cannot be static or override nor void or return type, but you can overload a constructor
	 - Default Constructor : No constructor is initialized
	 - Parameterized Constructor : Add different signature
	 -Constructor overloading : Different signature *Constructor is used to create the instance of the class* Constructor is the entry point of a class before even the main method *All instances can be a object*
	 */
	
	String studentName;
	int studentAge;
	
	public Constructor(String name, int age){
		studentName = name;
		studentAge = age;
	}
	
	public Constructor(String name){
		studentName = name;
	}
	
	public Constructor(int age){
		studentAge = age;
	}
	
	public static void main(String[] args) {
		
		Constructor obj = new Constructor("Farjana", 27);
		System.out.println(obj.studentName);
		System.out.println(obj.studentAge);
		
		Constructor obj2 = new Constructor("Sumaiya");
		System.out.println(obj2.studentName);

		Constructor obj3 = new Constructor(30);
		System.out.println(obj3.studentAge);	
	}
}
