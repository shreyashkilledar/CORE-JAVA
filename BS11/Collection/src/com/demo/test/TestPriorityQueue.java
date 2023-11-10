package com.demo.test;

import java.util.PriorityQueue;

import com.demo.beans.Person;

public class TestPriorityQueue {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		pq.add(12);
		pq.add(18);
		pq.add(13);
		pq.add(15);
		pq.add(15);
		System.out.println(pq);
		
		
		PriorityQueue<Person> pq1= new PriorityQueue<>();
		pq1.add(new Person(1,"Shreyash","434564","shreyash@gmail.com"));
		pq1.add(new Person(2,"Bhagya","434456464564","Bhagya@gmail.com"));
		pq1.add(new Person(3,"rutvik","4345654644","rutvik@gmail.com"));
		pq1.add(new Person(4,"Komal","43456464664","komal@gmail.com"));
		pq1.add(new Person(5,"Komal","43456464664","komal@gmail.com"));
		System.out.println(pq1);
	}
}
