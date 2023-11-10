package com.demo.test;

import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		
		TreeSet<Integer> ts= new TreeSet<>();
		ts.add(77);
		ts.add(98);
		ts.add(59);
		ts.add(10);
		ts.add(14);
		ts.add(45);
		ts.add(22);
		System.out.println(ts);
		
		TreeSet t1=(TreeSet) ts.headSet(22);
		TreeSet t2=(TreeSet) ts.tailSet(45);
		System.out.println(t1);
		System.out.println(t2);

	}

}
