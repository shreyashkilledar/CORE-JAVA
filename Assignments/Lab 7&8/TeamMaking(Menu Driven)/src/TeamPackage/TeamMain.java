package TeamPackage;

import java.util.Scanner;

public class TeamMain {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     TeamServices ts = new TeamServices();
	     int ch=0;
	     do 
	     {
	    	 System.out.println("1 : Add new Team\n 2 : DisplayAll\n 3 : Search By Player\n "
	    	 		+ "4 : Search By Captain \n 5 : Delete Team\n 6 : DeletePlayer");
	    	 System.out.println("Enter choice : ");
	    	 ch = sc.nextInt();
		     switch(ch)
		     {
		     case 1 :
		    	 ts.addTeam();
		    	 break;
		     case 2:
		    	 ts.displayAll();
		    	 break;
		    	 
		     case 3 :
		    	 sc.nextLine();
		    	 System.out.println("enter player name");
		    	 String s = sc.next();
		    	 Team p =ts.searchByPlayer(s);
		    	 if(p!=null)
			    	{
			    	 System.out.println(p);
			    	}
			    	else 
			    	System.out.println("Team not found");
		    	 break;
		     case 4:
		    	 System.out.println("enter the captain name");
		    	 String c = sc.next();
		    	Team t= ts.SearchByCaptain(c);
		    	if(t!=null)
		    	{
		    	 System.out.println(t);
		    	}
		    	else 
		    	System.out.println("Team not found");
		    	break;
		     case 5 :
		    	 System.out.println("Enter team name to delete");
		    	 String nm = sc.next();
		    	 boolean ss = ts.deleteTeam(nm);
		    	 if(ss)
		    	 {
		    		 System.out.println( "delete Successfully");
		    	 }
		    	 else 
		    		 System.out.println("not found");
		    	 break;
		     case 6 :
		    	 System.out.println("Enter player name to delete");
		    	 String pn = sc.next();
		    	 boolean sw = ts.deletePlayer(pn);
		    	 if(sw)
		    	 {
		    		 System.out.println( "delete Successfully");
		    	 }
		    	 else 
		    		 System.out.println("not found");
		        break;
		    	 
		     }
	     }while(ch!=7);

	}

}
