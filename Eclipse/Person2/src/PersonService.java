import java.util.Scanner;
public class PersonService {
	static Person[] parr;
	static int cnt;
	static {
		parr=new Person[100];
		parr[0]=new Person(1,"Abhi","44");
		parr[1]=new Person(3,"Shreyash","55");
		parr[2]=new Person(4,"Yash","23");
		parr[3]=new Person(5,"Pranav","55");
		cnt=4;
	}
	
	public static void addNewPerson() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter name");
		String nm=sc.nextLine();
		System.out.println("Enter mobile");
		String mob=sc.next();
		//validate the existence of id
		parr[cnt]=new Person(id,nm,mob);
		cnt++;
	}
	
	public static void displayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(parr[i]);
		}
	}
	public static Person searchById(int id) {
		/*for(int i=0;i<cnt;i++) {
			if(parr[i].getPid()==id)
				return parr[i];
		}
		return null;*/
		for(Person p:parr) {
			if(p!=null) {
				if(p.getPid()==id) {
					return p;
				}
			}else {
				return null;
			}
		}
		return null;
		
	}
	
	public static Person[] getByName(String nm) {
		//assumption maximum 10 people will be their with same name, other wise create array of size 100
		Person[] arr=new Person[10];
		int count=0;
		for(int i=0;i<cnt;i++) {
			if(parr[i].getPname().equals(nm)) {
				System.out.println("in if"+i);
				arr[count]=parr[i];
			    count++;
			}
		}
		if(cnt>0) {
			return arr;
	    }
		return null;
	}

}

