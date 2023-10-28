import java.util.Scanner;
public class StudentService {
	static Student [] parr;
	static int cnt;
	static {
		parr=new Student[100];
		parr[0]=new Student(1,"Abhi","44");
		parr[1]=new Student(3,"Shreyash","55");
		parr[2]=new Student(4,"Yash","23");
		parr[3]=new Student(5,"Pranav","55");
		cnt=4;
	}
   public static void addNewStudent()
     {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the Id");
	   int id=sc.nextInt();
	   sc.nextLine();
	   System.out.println("Enter the name");
	   String nm=sc.nextLine();
	   System.out.println("Enter the number");
	   String number=sc.next();
	   parr [cnt]=new Student(id,nm,number);
	   cnt++;
   }
   public static void displayAll()
   {
	   for(int i=0;i<cnt;i++)
		   System.out.println(parr[i]);
   }
   public static Student searchById(int id){
	   for(Student p:parr) {
			if(p!=null) {
				if(p.getid()==id) {
					return p;
				}
			}else {
				return null;
			}
		}
		return null;
		
	}
   public static Student[] getByName(String nm) {
		
		Student[] arr=new Student[10];
		int count=0;
		for(int i=0;i<cnt;i++) {
			if(parr[i].getname().equals(nm)) {
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


