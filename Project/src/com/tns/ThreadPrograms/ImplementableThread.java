package com.tns.ThreadPrograms;

public class ImplementableThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable");
	}
		public static void main(String args[])
		{
			ImplementableThread ob= new ImplementableThread();
			Thread t =new Thread(ob);
			t.start();
		}
	}
 
 

