package com.demo.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.demo.beans.Person;

public class TestHashSet {

	public static void main(String[] args) {
		
		Set<Person> hm= new HashSet<>();
		hm.add(new Person(1,"Shreyash","7559362276","shreyash@gmail.com"));
		hm.add(new Person(2,"Shreya","7559364444","shreya@gmail.com"));
		hm.add(new Person(3,"yash","7559367777","yash@gmail.com"));
		System.out.println(hm);

	}

}
