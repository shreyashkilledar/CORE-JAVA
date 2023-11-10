package test;

import java.util.Scanner;

import beans.Person;
import service.PersonService;
import service.PersonServiceImpl;

public class TestPerson {
	public static void main(String[] args) {
		
		PersonService ps= new PersonServiceImpl();
		Scanner sc= new Scanner(System.in);
		int choice=0;
		
		do
		{
			System.out.println("1.Add New Person\n2.Display All\n3.Display By Id\n4.Exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				ps.addNewPerson();
				break;
				
			case 2:
				Person[] parr= ps.findAll();
				for(Person p1:parr)
				{
					if(p1!=null)
					{
						System.out.println(p1);
					}
					else {
						break;
					}
				}
				break;
				
			case 3:
				System.out.println("Enter ID");
				int id=sc.nextInt();
				Person p= ps.displayById(id);
				if(p!=null)
				{
					System.out.println(p);
				}
				else
				{
					System.out.println("Not found");
				}
				break;
				
			case 4:
				System.out.println("Thanks For Watching");
				sc.close();
				break;
				
			default:
				System.out.println("Invalid Input");
				break;
			}
		}
		while(choice!=5);
	}

}
