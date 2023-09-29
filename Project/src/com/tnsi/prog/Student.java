package com.tnsi.prog;

public class Student extends Citizen {
	
 private int rollno;
 private int collegeName;
 
 
//public Student(int rollno, int collegeName) {
//	super();
  //  this.rollno = rollno;
//	this.collegeName = collegeName;
  public Student() {
	super();
}

public Student(String name, long aadharno, String address, long phno) {
	super(name, aadharno, address, phno);
	// TODO Auto-generated constructor stub
	this.rollno=rollno;
	this.collegeName=collegeName;
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public int getCollegeName() {
	return collegeName;
}

public void setCollegeName(int collegeName) {
	this.collegeName = collegeName;
}

//@Override
//public String toString() {
	//return "Student [rollno=" + rollno + ", collegeName=" + collegeName + "]";
//}


}
