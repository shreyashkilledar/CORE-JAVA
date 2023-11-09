import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
class EmployeeService 
{
	static Emp[] emparr;
	static int cnt;
	static 
	{
		emparr=new Emp[100];
		emparr[0]=new SalariedEmp(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345);
		emparr[1]=new SalariedEmp(13,"Ajit","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377);
		emparr[2]=new ContractEmp(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000);
		emparr[3]=new ContractEmp(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000);
		cnt=4;
	}

	public static void addnewEmployee(int ch) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr id");
		int pid=sc.nextInt();
		System.out.println("enetr name");
		String nm=sc.next();
		System.out.println("enetr mobile");
		String mob=sc.next();
		System.out.println("enetr email");
		String em=sc.next();
		System.out.println("enetr desg");
		String desg=sc.next();
		System.out.println("enetr dept");
		String dept=sc.next();
		System.out.println("eneter joining date(dd/mm/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		switch(ch) 
		{
		case 1:
			System.out.println("enter salary");
			double s=sc.nextDouble();
			System.out.println("enter bonus");
			double b=sc.nextDouble();
			emparr[cnt]=new SalariedEmp(pid, nm, mob, em, dept, desg,ldt, s, b);
			break;
		case 2:
			System.out.println("enetr hrs");
			int hrs=sc.nextInt();
			System.out.println("enter charges");
			double charges=sc.nextDouble();
			emparr[cnt]=new ContractEmp(pid, nm, mob, em, dept, desg, ldt, hrs, charges);
			break;
		case 3:
			System.out.println("create vendor object here");
			break;
		}
		cnt++;
		
	}
	
	
	public static boolean ModifysalById(int pid, double s) 
	{
		int pos=searchById(pid);
		if(pos!=-1) 
		{
			if(emparr[pos] instanceof SalariedEmp) 
			{
				((SalariedEmp)emparr[pos]).setSal(s);
		        
		    }else if(emparr[pos] instanceof ContractEmp) 
		    {
		    	((ContractEmp)emparr[pos]).setCharges(s);
		    }
			return true;
		}
		else
			return false;
	}
	
	
	public static void displayAll() 
	{
		for(Emp e:emparr) 
		{
		    
			if(e!=null) 
			{
				System.out.println(e);
			}
			else 
			{
				break;
			}
		}
		
	}
	private static int searchById(int pid) {
		for(int i=0;i<cnt;i++) {
			if(emparr[i].getPid()==pid) {
				return i;
			}
		}
		return -1;
		
	}
}