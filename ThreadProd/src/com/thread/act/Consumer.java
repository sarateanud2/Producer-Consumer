package com.thread.act;

import com.thread.store.Store;

public class Consumer implements Runnable {
	
	Store stare;
	private int product = 0;
	
	public Consumer(Store stare) {
		super();
		this.stare = stare;
	}



	@Override
	public void run() {
		try{
			while(product<5){
				product = product + stare.get();
				System.out.println("Consumer bought " + product + " product(s)");
				Thread.sleep(100);
			}
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}