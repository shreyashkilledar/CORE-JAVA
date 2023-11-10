package service;

import beans.Person;

public interface PersonService {
	
	void addNewPerson();
	
	Person[] findAll();
	
	Person displayById(int pid);

}
