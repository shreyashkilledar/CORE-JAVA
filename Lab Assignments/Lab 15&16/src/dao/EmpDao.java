package dao;

import java.util.ArrayList;

import beans.Employee;

public interface EmpDao {

	void ReadFile();

	void writeAll();

	void save(Employee e);

	ArrayList<Employee> getAll();

	boolean delete(int id3);

}
