
public class Employee {

	private int eid;
	private String dept;
	private String desg;
	public Employee() {
		super();
	}
	public Employee(int eid, String dept, String desg) {
		super();
		this.eid = eid;
		this.dept = dept;
		this.desg = desg;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
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
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", dept=" + dept + ", desg=" + desg + "]";
	}

}
