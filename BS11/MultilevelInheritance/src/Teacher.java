
public class Teacher extends School{
	
	private String tname;
	private String desg;
	private int tsal;
	public Teacher() {
		super();
	}
	public Teacher(String sname, String sadd,String tname, String desg, int tsal) {
		super( sname,  sadd);
		this.tname = tname;
		this.desg = desg;
		this.tsal = tsal;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getTsal() {
		return tsal;
	}
	public void setTsal(int tsal) {
		this.tsal = tsal;
	}
	@Override
	public String toString() {
		return super.toString()+"Teacher [tname=" + tname + ", desg=" + desg + ", tsal=" + tsal + "]";
	}

}
