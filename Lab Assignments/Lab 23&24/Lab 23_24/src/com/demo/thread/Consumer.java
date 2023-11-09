package com.demo.thread;

import com.demo.beans.storage;

public class Consumer extends Thread{
	
	     private storage s;
	     private int n;
	     public Consumer(storage s,int n) {
	    	 this.s=s;
	    	 this.n=n;
	     }
		 public void run() {
			 for(int i=0;i<n;i++) {
					s.get();
					
				}
		 
	}
}
