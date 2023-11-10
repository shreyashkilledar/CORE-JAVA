package com.demo.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Person;

public class TestArrayList {
	public static void main(String[] args) {
		
	
	
	List<Integer> elist= new ArrayList<>();
	Scanner sc= new Scanner(System.in);
	
		//1.Display ArrayList
	    for(int i=0;i<5;i++)
	{
		System.out.println("Enter data");
		int e= sc.nextInt();
		elist.add(e);
	}
	System.out.println(elist);
		
		
		//2.display addition of ArrayList
		int s=0;
		for(int i=0;i<elist.size();i++)
		{
			s=s+elist.get(i);
		}
		System.out.println(s);
		
		
		
		
		System.out.println("Enter Number To deletion");
		int num= sc.nextInt();
		Iterator<Integer> it= elist.iterator();
		while(it.hasNext()) {
			int n=it.next();
		    if(n==num) {
		    	it.remove();
		    }
		}
		
		elist.remove(new Integer(num));
		
		elist.removeIf((x)->(int)x==(num));
}

}