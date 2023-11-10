package com.demo.beans;

public class Person implements Comparable<Person>{
	
	private int id;
	private String name;
	private String mobile;
	private String email;
	
	public Person()
	{
		id=0;
		name=null;
		mobile=null;
		email=null;
	}

	public Person(int id, String name, String mobile, String email) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}
	
	public boolean equals(Object obj) {
		System.out.println("Equals="+this.id+"------>"+((Person)obj).id);
		return this.id==((Person)obj).id;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + "]";
	}

	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}

}
