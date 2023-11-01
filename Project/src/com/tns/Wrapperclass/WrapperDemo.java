package com.tns.Wrapperclass;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int x=20;
         Integer i=new Integer(x);
         System.out.println("x is object of integer type"+i);
         int u=i.intValue();
         System.out.println("u is primitive integer"+u);
	}

}
