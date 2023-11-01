package com.tns.ThreadPrograms;

public class CreatingThread extends Thread {
	public void run() {
		 System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatingThread t=new CreatingThread();
		t.start();
		t.run();

	}

}
