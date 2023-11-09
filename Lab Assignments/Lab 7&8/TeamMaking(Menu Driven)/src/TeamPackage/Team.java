package TeamPackage;

import java.util.Arrays;

public class Team {
	private int teamNo;
	private String teamName;
	private Player captain;
    private Player[] plist;
	public Team() {
		super();
	}
	public Team(int teamNo, String teamName, Player captain, Player[] parr) {
		super();
		this.teamNo = teamNo;
		this.teamName = teamName;
		this.captain = captain;
		this.plist = parr;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Player getCaptain() {
		return captain;
	}
	public void setCaptain(Player captain) 
	{
		this.captain = captain;
	}
	public Player[] getParr() 
	{
		return plist;
	}
	public void setParr(Player[] parr) 
	{
		this.plist = parr;
	}
	
	@Override
	public String toString() {
		return "Team [teamNo=" + teamNo + ", teamName=" + teamName + ", captain=" + captain + ", plist="
				+ Arrays.toString(plist) + "]";
	}

}
