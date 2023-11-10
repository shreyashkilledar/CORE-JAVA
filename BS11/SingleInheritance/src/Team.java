
public class Team {
	private int tid;
	private String tname;
	public Team() {
		System.out.println("Default Team");
	}
	public Team(int tid, String tname) {
		System.out.println("Para Of Team");
		this.tid = tid;
		this.tname = tname;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	
	public void display()
	{
		System.out.println("Team ID:"+tid);
		System.out.println("Team Name:"+tname);
	}
	@Override
	public String toString() {
		return "Team [tid=" + tid + ", tname=" + tname + "]";
	}

}
