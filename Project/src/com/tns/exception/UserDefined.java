package com.tns.exception;

import java.util.Scanner;
public class UserDefined {
    private static int age;
    
    static void validate() throws Age{
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter age");
    	age=sc.nextInt();
    	if(age<18)
    		throw new Age("invalid age,you are not eligilble");
    	else
    		System.out.println("you can vote");
    }
}
