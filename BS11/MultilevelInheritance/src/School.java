
public class School {
	
	private String sname;
	private String sadd;
	public School() {
		super();
	}
	public School(String sname, String sadd) {
		super();
		this.sname = sname;
		this.sadd = sadd;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	@Override
	public String toString() {
		return "School [sname=" + sname + ", sadd=" + sadd + "]";
	}

}
