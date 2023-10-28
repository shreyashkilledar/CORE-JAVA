public class Players extends Teams {
	private int Pid;
	private String Pname;
	private String Pskill;
	private int Playerage;
	public Players()
	{
		System.out.println("Defauilt Constructor");
	}
	public Players(int Tid, String Tname,int TeamId, String TeamName, int Pid,String Pname, String Pskill, int Playerage)
	{
		super(Tid,Tname,TeamId,TeamName);
		this.Pid=Pid;
		this.Pname=Pname;
		this.Pskill=Pskill;
		this.Playerage=Playerage;
	}
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getPskill() {
		return Pskill;
	}
	public void setPskill(String pskill) {
		Pskill = pskill;
	}
	public int getPlayerage() {
		return Playerage;
	}
	public void setPlayerage(int playerage) {
		Playerage = playerage;
	}
	
	public String toString()
	{
		return super.toString()+ "Players[Player Id= "+Pid+", Player Name= "+Pname+", Player Skill= "+ Pskill+", Player Age= "+Playerage+"]";
	}
}
