package com.tns.exceptions;

public class NestedTry {
	public static void check() {
	String str="Tns" ;
	int slength=str.length();
	System.out.println("the length is "+ slength);
	String anotherString="null";
	int y=6;
	try {//outer try
		int z=y/0;//exception occured
		try {//inner try
			System.out.println(anotherString);
		}
		catch(StringIndexOutOfBoundsException ex) {
		System.out.println("Indexout of bound"+ex.getMessage());
		}
		catch(NullPointerException ex) {
		System.out.println("NullPonter"+ex.getMessage());
		}
	}
	    catch(ArithmeticException ex) {//outer catch
		System.out.println("Arithmetic exception ex"+ex.getMessage());
		}
}
}