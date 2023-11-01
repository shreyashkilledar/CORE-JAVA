package bank1;

import java.util.Scanner;

//import bank.AccontService;

public class TeatAccount {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int choice;
		do
		{
		System.out.println("1.add new account\n 2.Display all accounts\n 3. display account by name\n 4.exist");
		
		choice=s.nextInt();
		switch(choice)
		{
		case 1 :
			System.out.println(" 1.saving 2.current");
			int ch=s.nextInt();
			AccontService.addnewAccount(ch);
			break ;
			
		case 2:
			AccontService.displayAllAccounts();
			break ;
		case 3:
			System.out.println("Enter name of search Account : ");
			String name=s.next();
			AccontService.searchByName(name);
			break;
		case 4:
			System.out.println("Thank You");
		break;
		default :
			System.out.println("wrong choice");
		}
				
		
		}while(choice!=4);
	}

}
