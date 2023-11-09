import java.time.LocalDate;
public class Emp extends Person12{
	private String dept;
	private String desg;
	private LocalDate doj;
	public Emp() {
		super();
	}
	public Emp(int id, String name, String mobile, String email,String dept, String desg, LocalDate doj) {
		super(id,name,mobile,email);
		this.dept = dept;
		this.desg = desg;
		this.doj = doj;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return super.toString()+"Emp [dept=" + dept + ", desg=" + desg + ", doj=" + doj + "]";
	}
	

}
