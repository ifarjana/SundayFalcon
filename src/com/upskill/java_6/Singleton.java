package com.upskill.java_6;

public class Singleton {

	// Singleton is class that can have only one object
	
	// Private constructor, it prevents any other class from instantiating 
	private Singleton(){
		
	}
	
	// Private static object of the class
	private static Singleton SingletonObj = new Singleton();
	
	public static Singleton getInstance(){      //Get instance 
		return SingletonObj;
	}
	
	protected static void demo(){
		System.out.println("Demo method for singleton class");
	}
	
	//test git review class
}

