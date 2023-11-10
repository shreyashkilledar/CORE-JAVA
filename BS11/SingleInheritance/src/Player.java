public class Player extends Team {
	
	private int pid;
	private String pname;
	public Player() {
		super();
	}
	public Player(int tid, String tname,int pid, String string) {
		super( tid,  tname);
		this.pid = pid;
		this.pname = string;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"Player [pid=" + pid + ", pname=" + pname + "]";
	}

}
