import java.time.LocalDate;
public class TestPerson {

	public static void main(String[] args) {
		Emp11 e=new Emp11(12,"xxx","3333","asd@gmail.com","Hr","mgr",LocalDate.of(2001,11,23));
        System.out.println(e);
        SalariedEmp semp=new SalariedEmp(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345);
		System.out.println(semp);
		ContractEmp cemp=new ContractEmp(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),30,4000);
		System.out.println(cemp);
		
		Emp11 e1=new SalariedEmp();
		Person11 p=new SalariedEmp();
	
	}

}
