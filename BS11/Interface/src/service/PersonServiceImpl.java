package service;

import java.util.Scanner;

import beans.Person;
import dao.PersonDao;
import dao.PersonDaoImpl;

public class PersonServiceImpl implements PersonService {
	
	private PersonDao pdao;
	public PersonServiceImpl()
	{
		pdao= new PersonDaoImpl();
	}

	@Override
	public void addNewPerson() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ID");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter name");
		String nm= sc.nextLine();
		
		System.out.println("Enter mobile");
		String mob= sc.nextLine();
		
		System.out.println("Enter Email");
		String email= sc.nextLine();
		
		Person p= new Person(id,nm,mob,email);
		pdao.save(p);
	}

	@Override
	public Person[] findAll() {
		return pdao.displayAll();
	}

	@Override
	public Person displayById(int pid) {
		return pdao.Bhagyashri(pid);
	}
	
	

}
