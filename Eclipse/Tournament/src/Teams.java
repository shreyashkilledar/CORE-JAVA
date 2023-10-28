
 public class Teams extends Tournament {
	 private int TeamId;
	 private String TeamName;
	 public Teams()
	 {
		 System.out.println("Default Constructor");
	 }
	 public Teams(int Tid, String Tname,int TeamId, String TeamName)
	 {
		 super(Tid,Tname);
		 this.TeamId=TeamId;
		 this.TeamName=TeamName;
	 }
	 public void setTeamId(int TeamId)
	 {
		 this.TeamId=TeamId;
	 }
	 public int getTeamId()
	 {
		 return this.TeamId;
	 }
	 public void setTeamName(String TeamName)
	 {
		 this.TeamName=TeamName;
	 }
	 public String getTeamName()
	 {
		 return this.TeamName;
	 }
	 public String toString()
	 {
		 return super.toString()+ "Teams[Team ID= "+TeamId+", Team Name= "+TeamName+"]";
	 }
}
