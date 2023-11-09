import java.time.LocalDate;
import java.util.Date;
public class Emp11 extends Person11 {
	private String department;
	private String designation;
	private LocalDate DOJ;
	
	public Emp11()
	{
		System.out.println(" default constructor");
		
	}
	
	public Emp11(int id, String name,String mobile, String email,String department,String designation,LocalDate DOJ)

	{
		super (id,name,mobile,email);
		System.out.println("Paramaterised construstor");
		
		this.department=department;
		this.designation=designation;
		this.DOJ=DOJ;
		
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public LocalDate getDOJ() {
		return DOJ;
	}

	public void setDOJ(LocalDate DOJ) {
		DOJ = DOJ;
	}
	
	public String toString()
	{
		return super.toString()+" Employee [dept=" + department + ", desg=" + designation + ", doj=" + DOJ + "]";
	}

}
