package com.thread.store;

public class Store {
	
	private int counter = 0;
	private final int N = 5;
	
	//method for production
	public synchronized int put(){
		
		if(counter <= N){
			counter++;
			System.out.println("Store has " + counter + " product(s)");
			return 1;// if we could make it return 1
		}
		
		return 0;// if we could't make it
	}
	
	//method for sell
	public synchronized int get(){
		
		if(counter > 0){
			counter--;
			System.out.println("Store has " + counter + " product(s)");
			return 1;
		}
		
		return 0;
	}
	
	
}


