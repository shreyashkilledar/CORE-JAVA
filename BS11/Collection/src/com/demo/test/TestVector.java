package com.demo.test;

import java.util.Vector;
public class TestVector {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>(50,10);
		v.add(10);
		v.add(20);
		v.add(45);
		v.add(14);
		v.add(32);
		//System.out.println(v);
		//System.out.println(v.get(1));
		//System.out.println("Capacity: "+ v.capacity());
		//System.out.println("Size: "+v.size());
		
		for(int i=1;i<10;i++)
		{
			v.add(i+100);
		}
		System.out.println(v);
		System.out.println("Capacity: "+ v.capacity());
		System.out.println("Size: "+v.size());
		
	}

}
