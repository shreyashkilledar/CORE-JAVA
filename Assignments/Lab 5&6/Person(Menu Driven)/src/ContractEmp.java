import java.time.LocalDate;

public class ContractEmp extends Emp {
	private int hours;
	private double charges;
	public ContractEmp() {
		super();
	}
	public ContractEmp(int id, String name, String mobile, String email,String dept, String desg, LocalDate doj,int hours, double charges) {
		super(id,name,mobile, email,dept, desg, doj);
		this.hours = hours;
		this.charges = charges;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return super.toString()+"ContractEmp [hours=" + hours + ", charges=" + charges + "]";
	}
	

}
