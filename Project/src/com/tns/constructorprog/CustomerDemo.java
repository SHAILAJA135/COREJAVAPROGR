package com.tns.constructorprog;

import java.util.Scanner;
public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         String name,city;
         int id;
         System.out.println("enter customerId");
         	id= sc.nextInt();
         	sc.nextLine();
            System.out.println("enter name");
            name=sc.nextLine();
   
            System.out.println("enter city");
            city=sc.nextLine();
           
            Customer c1=new Customer(name,id,city);//calling default constructor
  //          c1.setCustomerId(id);
 //           c1.setCustomerName(name);
//            c1.setCustomerCity(city);
            System.out.println(c1);

	}

}
