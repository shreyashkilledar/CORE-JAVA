
import java.time.LocalDate;

public class ContractEmp extends Emp11{
	private int hrs;
	private double charges;
	public ContractEmp() {
		super();
	}
	public ContractEmp(int pid, String pname, String mobile, String email,String dept, String desg, LocalDate doj,int hrs, double charges) {
		super(pid,pname,mobile,email,dept,desg,doj);
		this.hrs = hrs;
		this.charges = charges;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return super.toString()+"ContractEmployee [hrs=" + hrs + ", charges=" + charges + "]";
	}
	
	

}
