
class Tournament {
	
	private int Tid;
	private String Tname;
	
	public Tournament ()
	{
		System.out.println(" default constructor");
	
	}
	public Tournament(int Tid,String Tname)
	{
		this.Tid=Tid;
		this.Tname=Tname;
	}


	public int getTid() {
		return Tid;
	}
	public void setTid(int tid) {
		Tid = tid;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public String toString()
	{
		return "Tournament [Tid="+ Tid+",Tname="+Tname+"]";
	}
}

