package com.tns.inheritanceprog;
class Parent
{
	int var=100;
	
}
public class SuperDemo extends Parent
{
	int var=50;
	void display()
	{
	System.out.println("the child value is"+var);
	System.out.println("the child value is "+super.var);
	}
public static void main(String args[])
{
	SuperDemo ob=new SuperDemo();
	ob.display();
	
}
}
