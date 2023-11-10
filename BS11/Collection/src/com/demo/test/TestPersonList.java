package com.demo.test;

import java.util.ArrayList;

import com.demo.beans.Person;

public class TestPersonList {
	public static void main(String[] args) {
		
		ArrayList<Person> bs= new ArrayList<>();
		bs.add(new Person(1,"Shreyash","7559362276","shreyash@gmail.com"));
		bs.add(new Person(2,"Shreya","7559364444","shreya@gmail.com"));
		bs.add(new Person(3,"yash","7559367777","yash@gmail.com"));
		bs.add(new Person(4,"SK","10028","SK@gmail.com"));
		
		System.out.println(bs);
		
		
		bs.remove(new Person(2,null,null,null));
		bs.remove(new Person(3,null,null,null));
		System.out.println(bs);
		
		bs.add(new Person(5,"Komal","4123654","konal@gmail.com"));
		System.out.println(bs);
	}

}
