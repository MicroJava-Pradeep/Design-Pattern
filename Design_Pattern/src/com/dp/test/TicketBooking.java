package com.dp.test;

import com.dp.sdp.Printer;

public class TicketBooking implements Runnable {
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * }
	 */

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Printer p=null;
		p=Printer.getInstance();
		System.out.println(p.hashCode()+"  "+Thread.currentThread().getName());
		
	}

}
