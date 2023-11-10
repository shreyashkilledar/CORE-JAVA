
public class Test {
	public static void main(String[] args) {
		
		Employee e= new Employee(1,"HR","Design");
		System.out.println(e);
		
		SalEmp s= new SalEmp(1,"HR","Design",20000,5000);
		System.out.println(s);
		
		ConEmp c= new ConEmp(1,"HR","Design",10,2000);
		System.out.println(c);
	}

}
