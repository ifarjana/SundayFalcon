package com.upskill.java_1;

public class AccessModifier {

	public String name = "Farzana";		// public - Any class can access
	
	private int age = 27;				// private - Only same class can access
	
	protected int ssn = 245861559;		// protected - classes in the same package and subclass
	
	String address = "Parkside";		// default - classes in same package can access
		
}