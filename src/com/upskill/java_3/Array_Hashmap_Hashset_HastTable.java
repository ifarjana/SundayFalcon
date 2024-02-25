package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HastTable {

	public static void main(String[] args) {

		//Array store multiple data using index - (Array stores multiple values)
		
		int age = 30;											//Variable
		int [] ageFalcon = new int[]{25, 27, 30, 35, 40};		//Array
		
		//Array index				 [0] [1] [2] [3] [4]	
		
		System.out.println("Student Age : " + ageFalcon[1]);
		System.out.println("Total Student : " + ageFalcon.length);
		
		//Write an Array for Student name nameFalcon ?
		
		String[] nameFalcon = new String[]{"Jannatul", "Farjana", "Sumaiya", "Rumi", "salman"};
		System.out.println("Student Name : " + nameFalcon[1]);
		System.out.println("Total Student : " + nameFalcon.length);
		
		boolean[] attendenceFalcon = new boolean[] {true, false, false, true, true};
		System.out.println("Student Attendence ; " + attendenceFalcon[4]);
		System.out.println("Total Student : " + attendenceFalcon.length);
		
		//Multi-Dimentional Array
		int[][] ageFalcon2D = {{25, 27, 30, 35, 40},		//[0][0] [0][1] [0][2] [0][3] [0][4]
								{24, 29, 32, 22}};			//[1][0] [1][1] [1][2] [1][3]
		
		System.out.println("Student Age 2D : " + ageFalcon2D[0][2]);
		
		//Hashmap(class, non primitive) store multipul data using key-value pair, Implementation of Map interface
		
		HashMap<String, Integer> StudentAge = new HashMap<String, Integer>();
		
		StudentAge.put("Jannatul", 25);
		StudentAge.put("Farjana", 27);
		StudentAge.put("Sumaiya", 30);
		StudentAge.put("Rumi", 40);
		StudentAge.put("Salman", 35);
		
		System.out.println("Hashmap Sudent Age :" + StudentAge.get("Farjana"));
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		Capital.put("BD", "Dhaka");
		Capital.put("USA", "Washington DC");
		System.out.println("Hashmap Capital : " + Capital.get("BD"));
		
		
		
		//HashTable store multiple data using key_value pair, No duplicate,
		//also is synchronized (only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("BD", "Asia");
		
		//Hashset store unordered collection containing unique value, Implementaion of Set interface
		HashSet<String> car = new HashSet<>();
		car.add("BMW");
		car.add("Tesla");
		car.add("Audi");
		car.add("Toyota");
		System.out.println("car : " + car);
		
		HashSet<String> ID = new HashSet<>();
		ID.add("6428");
		ID.add("9761");
		ID.add("2685");
		ID.add("4628");
		System.out.println("ID : " + ID);
		
		
		
		}
	}
