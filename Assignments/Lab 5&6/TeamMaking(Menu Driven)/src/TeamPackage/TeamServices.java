package TeamPackage;

import java.util.Scanner;

public class TeamServices {
	static int cnt;
	static Team[] tarr;
	static {
		tarr=new Team[10];
		tarr[0]=new Team(1,"india",new Player(45,"Rohit","Batter"),
				new Player[]{new Player(8,"jadeja","AllRounder"),new Player(18,"Virat","Batter"),
		new Player(9,"Bumrah","Bowler")});
		cnt=1;
	}

	public void addTeam() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the team no:");
		int tid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the team name:");
		String tname=sc.nextLine();
		System.out.println("Enter the captain no:");
		int cid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the captain name:");
		String cname=sc.nextLine();
		System.out.println("Enter the captain skill:");
		String cskill=sc.nextLine();
		Player c=new Player(cid,cname,cskill);
		Player[] plist=new Player[3];
		for(int i=0;i<plist.length;i++) {
			System.out.println("Enter the player no:");
			int pid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the player name:");
			String pname=sc.nextLine();
			System.out.println("Enter the player skill:");
			String pskill=sc.nextLine();
			plist[i]=new Player(pid,pname,pskill);

		}
		tarr[cnt]=new Team(tid,tname,c,plist);
		cnt++;
	}
	public void displayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(tarr[i]);
		}
	}
	public Team SearchByCaptain(String c) {
		for(int i=0 ; i<cnt ; i++)
		{
			if((tarr[i].getCaptain().getName()).equals(c))
			{
				return tarr[i];
			}
		}
		return null;
	}

	public Team searchByPlayer(String p) 
	{

		for(int i=0 ; i<=cnt ; i++)
		{
			Player [] pl =tarr[i].getParr();
			for(int j=0 ; j<pl.length;j++)
			{
				if(pl[j].getName().equals(p))
				{
					return tarr[i];
				}
			}
		}
		return null;

	}
	
	public boolean deleteTeam(String name)
	{
		Scanner sc = new Scanner(System.in);
		for(int i =0 ; i<cnt ; i++)
		{
			if(tarr[i].getTeamName().equals(name))
			{
				System.out.println("do you want to delete Y/N");
				String s = sc.next();
				if(s.equals("Y"))
				{
					tarr[i]=tarr[i+1];
					return true;
				}
				
				else 
					System.out.println("Not Deleted");
				
			}
			
		}
		return false;
	}
	public boolean deletePlayer(String name)
	{
		System.out.println("dag");
		Scanner sc = new Scanner(System.in);
		for(int i =0 ; i<cnt ; i++)
		{
			System.out.println("1st");
			Player[] p = tarr[i].getParr();
			for(int j=0;j<p.length;j++)
			{
				System.out.println("2nd");
				if(p[j].getName().equals(name))
					
				   {
					System.out.println("if");
						System.out.println("do you want to delete Y/N");
						String s = sc.next();
						if(s.equals("Y"))
						{
							p[j]=p[j+1];
							return true;
						}
						else 
							System.out.println("Not Deleted");
						
					}
					
				}
				
			}
		return false;
	}

}
