package com.tns.abstraction;
//program to demonstrate abstraction in java
public abstract class Shape {
protected float area;
//Abstract method
abstract void calArea();
void show() {//concrete method
	System.out.println("area of shape is "+area);
}
}
