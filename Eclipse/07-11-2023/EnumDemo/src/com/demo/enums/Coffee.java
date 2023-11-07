package com.demo.enums;

public enum Coffee {
	
	small(100,150),medium(200,300),big(300,450);
	private int size;
	private int price;
	
	private Coffee(int s,int p)
	{
		System.out.println("In Coffee Constructor");
		size=s;
		price=p;
	}
	
	public int getsize()
	{
		return size;
	}
	
	public int getprice()
	{
		return price;
	}

}
