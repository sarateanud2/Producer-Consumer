package com.thread.main;

import com.thread.act.Consumer;
import com.thread.act.Producer;
import com.thread.store.Store;

public class Main {

	public static void main(String[] args) {
		
		Store store = new Store();
		new Thread(new Producer(store)).start();
		new Thread(new Consumer(store)).start();

	}

}


