package com.demo.test;

import com.demo.beans.storage;
import com.demo.thread.Producer;
import com.demo.thread.Consumer;

public class TestProducerConsumer {

	public static void main(String[] args) {
		storage s=new storage();
		Producer p=new Producer(s,10);
		Consumer c=new Consumer(s,10);
		p.start();
		c.start();
	}

}
