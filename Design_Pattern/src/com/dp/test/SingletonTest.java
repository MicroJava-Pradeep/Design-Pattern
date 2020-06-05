package com.dp.test;

import com.dp.sdp.Printer;

public class SingletonTest {
	
	
	public static void main(String [] args) {
		Printer p1=null, p2=null;
		//p1=new Printer();
		//p2=new Printer();
		p1=Printer.getInstance();
		p2=Printer.getInstance();
		System.out.println(p1.hashCode()+"  " +p2.hashCode());
		System.out.println("(p1==p2?)"+(p1==p2));
		System.out.println("=========================");
		p1.printData("Hello");
		p2.printData("Hi");
		
		
		
	}
	

}
