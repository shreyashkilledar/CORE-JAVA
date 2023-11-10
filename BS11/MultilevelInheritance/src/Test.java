
public class Test {
	public static void main(String[] args) {
		
		School s= new School("LPC","Karad");
		System.out.println(s);
		
		Student st= new Student("LPC","Karad",1,"Shreyash","Satara");
		System.out.println(st);
		
		Teacher t= new Teacher("LPC","Karad","Bhagyashri","Principle",80000);
		System.out.println(t);
		
		Trainer tr= new Trainer("LPC","Karad","Bhagyashri","Principle",80000,12,"Rutvik","ISO");
		System.out.println(tr);
		
	}

}
