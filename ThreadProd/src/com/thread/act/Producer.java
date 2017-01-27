package com.thread.act;


import com.thread.store.Store;

public class Producer implements Runnable {
	
	Store store;
	private int product = 5;
	
	public Producer(Store store) {
		this.store = store;
	}

	@Override
	public void run() {
		try {
			while(product>0){
				product = product - store.put();
				System.out.println("Producer has to product " + product + " product(s)");
				Thread.sleep(100);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}