package com.demo.beans;

public class Student {
	private int id;
	private String name;
	private int marks;
	private String address;
	
	public Student(int id, String name, int marks, String address)
	{
		System.out.println("Parameterized Constructor.");
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.address=address;
		System.out.println(id+" "+name+" "+marks+" "+address);
	}
	
	public Student()
	{
		System.out.println("Default Constructor.");
	}
	
//	public int getId() {return id;}
//	public String getName() {return name;}
//	public int getMarks() {return marks;}
//	public String getAddress() {return address;}
//	
//	public void setId(int id) {this.id=id;}
//	public void setName(String name) {this.name=name;}
//	public void setMarks(int marks) {this.marks=marks;}
//	public void setAddress(String address) {this.address=address;}
	
}
