package com.upskill.java_4;

public class Encapsulation {
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		System.out.println(obj.getName());
		obj.setName("Samiya");
		System.out.println(obj.getName());
		obj.setssn(999999999);
		System.out.print(obj.getusername());
		obj.setpassword("Farjana999");
	}

	//Encapsulation used to hide the data using setter and getter method
	
	private String name = "Farjana";						//Read & Write
	private int mobileNumber = 354826795;					//Retrieve, read only
	private int ssn = 357615684;							//Update, write only
	private String username = "Upskill";					//Retrieve, read only
	private String password = "Farjana123";					//Update, write only
	
	//Setter Methoid - name									//set the data, write
	public void setName(String value) {
		name = value;
	}
	
	//Getter Method - name 									//get the data, read
	public String getName() {
		return name;
	}
	
	//Getter Method - MobileNumber							//get the data, read
	public int setmobileNumber() {
		return mobileNumber;
	}
	
	//Setter Method - ssn									//set the data, write
	public void setssn(int value) {
		ssn = value;
	}
	
	//Getter Method - username
	public String getusername() {
		return username;
	}
	
	//Setter Method - password
	public void setpassword(String value) {
		password = value;
	}
}

