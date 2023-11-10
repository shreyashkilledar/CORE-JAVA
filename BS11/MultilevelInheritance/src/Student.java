
public class Student extends School {
	
	private int rno;
	private String stname;
	private String stadd;
	public Student() {
		super();
	}
	public Student(String sname, String sadd,int rno, String stname, String stadd) {
		super( sname,  sadd);
		this.rno = rno;
		this.stname = stname;
		this.stadd = stadd;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public String getStadd() {
		return stadd;
	}
	public void setStadd(String stadd) {
		this.stadd = stadd;
	}
	@Override
	public String toString() {
		return super.toString()+"Student [rno=" + rno + ", stname=" + stname + ", stadd=" + stadd + "]";
	}
	
	

}
