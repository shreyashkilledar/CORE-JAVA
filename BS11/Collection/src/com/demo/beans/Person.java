package com.demo.beans;
public class Person implements Comparable<Person> {
	
	private int id;
	private String name;
	private String mob;
	private String email;
	
	public Person() {
		id=0;
		name=null;
		mob=null;
		email=null;
	}

	public Person(int id, String name, String mob, String email) {
		super();
		this.id = id;
		this.name = name;
		this.mob = mob;
		this.email = email;
	}
	
	public boolean equals(Object ob)
	{
		System.out.println(this.id + " "+((Person)ob).id);
		return this.id==((Person)ob).id;
	}
	public int hashCode()
	{
		System.out.println(this.id);
		return this.id;
		
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

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mob=" + mob + ", email=" + email + "]";
	}

	@Override
	public int compareTo(Person o) {
		
		return this.name.compareTo(o.name);
	}
}
