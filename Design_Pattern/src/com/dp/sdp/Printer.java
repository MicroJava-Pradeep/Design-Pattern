
package com.dp.sdp;

public class Printer {
	
	private static Printer INSTANCE;// ISTANCE= new INSTANCE eager instantiation bad practice
	
	// private constructor
	private Printer() {
		
		System.out.println("Printer::0-param constructor");
	}
	// static factory method
	//public static Printer getInstance()
	//synchromized
	/*
	 * public synchronized static Printer getInstance() { if(INSTANCE==null)
	 * 
	 * INSTANCE= new Printer(); // LAZY INSATNCIATIN GOOD PRACTICE return INSTANCE;
	 * }
	 */
	
	///////////// stic factory method
	public  static Printer getInstance(){
		// insted of sych method create synch class for class level  locking  of class object
		// double null check is good practice to improve performence
		if(INSTANCE==null) {
			
		synchronized(Printer.class) {
		if(INSTANCE==null)
			
			INSTANCE= new Printer(); // LAZY INSATNCIATIN GOOD PRACTICE
		}//if
		}//if
		return INSTANCE;
	
	}//method

	/*	
		 public void printData(String data) { 
			 System.out.println(data); }
		 
	}*/
	// b method
	public void printData(String data) {
		// TODO Auto-generated method stub
		System.out.println(data);
		
		
		/// main method to run in command Prompt
		public static void main(String [] args) {
			System.out.println("Jenkins Job");
			
		}
	}

}
