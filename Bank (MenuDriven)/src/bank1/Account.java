package bank1;

public class Account {
	private String ifsc;
	private String bname;
	private String badd;
	private String name;
	public Account() {
		super();
	}
	public Account(String ifsc, String bname, String badd, String name) {
		super();
		this.ifsc = ifsc;
		this.bname = bname;
		this.badd = badd;
		this.name = name;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBadd() {
		return badd;
	}
	public void setBadd(String badd) {
		this.badd = badd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Account [ifsc=" + ifsc + ", bname=" + bname + ", badd=" + badd + ", name=" + name + "]";
	}
	
	

}
