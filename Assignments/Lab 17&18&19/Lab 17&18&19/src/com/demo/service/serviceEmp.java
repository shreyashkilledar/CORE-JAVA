package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface serviceEmp {

	void addNewEmp(int ch);

	List<Employee> displayAll();

	Employee displayByID(int id1);

	List<Employee> sortByName();

	boolean deletebyID(int id3);

	boolean modifySalById(int id5, double sal);

	List<Employee> sortBySalary();

	List<Employee> sortByDesg();

}
