package com.tns.staticprograms;
//program to demonstrate static variable
public class Employee {
	//instance variables
	private String name;
	private int id;
	
	//declare statuc variables
	static String companyName="Tns";

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ",company="+companyName+"]";
	}
	
	
	

}
