package com.flow;

import java.util.Scanner;

public class ex_Handling {
	
	void thread_Sleep() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
Scanner a=new Scanner(System.in);
System.out.println("Enter input");



try {
	int newint = a.nextInt();
	int s=newint % 0;
	System.out.println(s);
		
	
} catch (Exception e) {
	// TODO: handle exception
	System.out.println(e);
	e.getStackTrace();//-exception with line number
	System.out.println(e.getMessage());//print only message
	System.err.println("input must be number" +e);//red line
}

finally {
	System.out.println("completed");
}
}
}
