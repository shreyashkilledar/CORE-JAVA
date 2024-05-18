package bank1;

import java.util.Scanner;
public class AccontService {
static Account[] arr=new Account[100];
static int cnt =0;
public static void addnewAccount(int ch) 
	{
		Scanner s=new Scanner(System.in);
//		System.out.println("Enter ifsc");
//		String ifsc=s.next();
		String ifsc="IDBI123";
//		
//		System.out.println("Enter bname");
//		String name=s.next();
		String name="IDBI_SATARA";
		
//		System.out.println("Enter address");
//		String add=s.next();
		String add="MH-11_SATARA";
		
		System.out.println("enter account holders name");
		String cnm=s.next();
		switch(ch)
		{
		case 1:
			System.out.println("enter account no");
			int acc=s.nextInt();
			
			
			System.out.println("enter account rate");
			double rte=s.nextDouble();
			//int acno, double rate,String ifsc, String bname, String badd, String name
			arr[cnt]=new Saving(acc,rte,ifsc,name,add,cnm);
			cnt++;
			break;
			
		case 2:
			System.out.println("enter account no");
			int cacc=s.nextInt();
			
			
			System.out.println("enter account rate");
			double crte=s.nextDouble();
			
			arr[cnt]=new Saving(cacc,crte,ifsc,name,add,cnm);
			cnt++;
			break;
		default :
			System.out.println("Wrong choice ..");
		}
	}


	public static void displayAllAccounts() 
	{
		if(arr.length>0)
		{
			for(int i=0;i<cnt;i++)
			{
				System.out.println(arr[i]);
			}
			
			
		}else
		{
			System.out.println("Array is null");
		}
	}


	public static void searchByName(String name) 
	{
		if(arr.length>0)
		{
			for(int i=0;i<cnt;i++)
			{
				if(arr[i].getName().equals(name))
				{
					System.out.println(arr[i]);
					break;
				}
				System.out.println("not found");
			}
		}else
		{
			System.out.println("Array is null");
		}
	}
}
