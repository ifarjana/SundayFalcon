package com.upskill.java_1;

public class Variables {
	
		//Variables in Java
			//Instance OR global variables - Variables declared in Class Level, outside method
			// Static variables - variables belong to class and don't required creating object
			//Local variables - variables declared in methods
			//Method parameter - variables used as method parameter
	
	
	String country = "USA";					//Instance OR global variables - Variables declared in Class Level, outside method
	
	static String region  =  "America";		// Static variables - variables belong to class and don't required creating object
	
	public static void main(String[] args) {
		String city = "New York";			//Local variables - variables declared in methods
		System.out.println(city);
		String police = "NYPD";
		int zipcode = 10010;
		
		Variables object = new Variables();	// ClassName ObjectName = new ClassName();   *to get the access you have to create a object*
		System.out.println(object.country);
		
		System.out.println(region);
		
		object.CT("Danbary");
	}

	
	public void NJ(){
		String city = "Jersey City";		//Local variables - variables declared in methods
		System.out.println(city);
		
		Variables object = new Variables();
		System.out.println(object.country);
		
		System.out.println(region);
	}
	
	public void CT(String county){			//Method parameter - variables used as method parameter   *passing data from between global and local* like an ambassador* 
		String myCounty = county;
		System.out.println(myCounty);
		
		String city = "New Haven";			//Local variables - variables declared in methods
		System.out.println(city);
		
		Variables object = new Variables();
		System.out.println(object.country);
		
		System.out.println(region);
	}
	
	
}
