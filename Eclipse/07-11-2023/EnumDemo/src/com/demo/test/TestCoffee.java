package com.demo.test;

import com.demo.enums.Coffee;

public class TestCoffee {

	public static void main(String[] args) {
		Coffee c= Coffee.medium;
		switch(c)
		{
		case small:
			System.out.println("You selected small:"+c.getsize()+",Price:"+c.getprice());
			break;
		case medium:
			System.out.println("You selected medium:"+c.getsize()+",Price:"+c.getprice());
			break;
		case big:
			System.out.println("You selected large:"+c.getsize()+",Price:"+c.getprice());
			break;
		}

	}

}
