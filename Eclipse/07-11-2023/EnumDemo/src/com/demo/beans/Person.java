package com.demo.beans;

import com.demo.enums.Gender;

public class Person {
	
	private int id;
	private String name;
	private String mob;
	private String email;
	private Gender g;
	
	public Person()
	{
		System.out.println("Default Person");
	}
	
	public Person(int id,String name,String mob,String email,Gender g)
	{
		this.id=id;
		this.name=name;
		this.mob=mob;
		this.email=email;
		this.g=g;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public Gender getG() {
		return g;
	}

	public void setG(Gender g) {
		this.g = g;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mob=" + mob + ", email=" + email + ", g=" + g + "]";
	}

	

}
