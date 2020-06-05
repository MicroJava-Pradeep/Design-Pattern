package com.dp.test;

public class MultiThreadingtest {
	
	public static void main(String [] args) {
		
		TicketBooking servlet=null;
		Thread req1=null;
		Thread req2=null;
		
		servlet=new TicketBooking();
		req1=new Thread(servlet);
		req2=new Thread(servlet);
		
		req1.start();
		req2.start();
	}

}
