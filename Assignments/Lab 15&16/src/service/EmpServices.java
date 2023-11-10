package service;

import java.util.ArrayList;

import beans.Employee;

public interface EmpServices {

	void ReadFile();

	void WriteFile();

	void addEmp();

	ArrayList<Employee> DisplayAll();

	boolean deletebyId(int id3);

}
