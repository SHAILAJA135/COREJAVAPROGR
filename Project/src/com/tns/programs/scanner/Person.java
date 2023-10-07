package com.tns.programs.scanner;

public class Person {
      private String name;;
      private int Income;
      private int tax;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIncome() {
		return Income;
	}
	public void setIncome(int income) {
		Income = income;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", Income=" + Income + ", tax=" + tax + "]";
	}
    
}
