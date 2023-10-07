package com.tns.markerinterface;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a =new Student(1,"siri");
        if(a instanceof Registerable) 
        {
        System.out.println("Student Registered");
        }
        else
        {
        	System.out.println("Student Not Registered");
        }
	}
}
