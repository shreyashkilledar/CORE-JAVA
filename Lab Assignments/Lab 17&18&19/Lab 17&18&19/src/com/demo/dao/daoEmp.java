package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface daoEmp {

	List<Employee> sortAllName = null;
	boolean modifySal = false;
	List<Employee> sortSalary = null;

	void save(Employee e);

	List<Employee> showall();

	Employee findById(int id1);

	List<Employee> sortName();

	boolean remove(int id3);

	boolean modifySal(int id5, double sal);

	List<Employee> sortSalary();

	List<Employee> sortDesg();

}
