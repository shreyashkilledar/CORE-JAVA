package dao;

import java.util.List;

import beans.Person;

public interface PersonDao {
	
	void save(Person p);
	
	Person[] displayAll();
	
	Person Bhagyashri(int pid);

}
