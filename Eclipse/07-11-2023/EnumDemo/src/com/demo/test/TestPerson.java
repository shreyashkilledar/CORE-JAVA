package com.demo.test;

import com.demo.beans.Person;
import com.demo.enums.Gender;

public class TestPerson {

	public static void main(String[] args) {
		
		Person p= new Person(1,"shreyash","7559362276","shreyash@gmail.com",Gender.Male);
		System.out.println(p);

	}

}
