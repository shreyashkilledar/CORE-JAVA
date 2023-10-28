
 class testTournament {
	 public static void main(String[]args)
	 {
		 Tournament T1=new Tournament(1,"IPL");
		 Tournament T2=new Tournament(2,"BBL");
		 System.out.println(T1);
		 System.out.println(T2);
		 System.out.println();
		 
		 Teams t1= new Teams(1,"IPL",1,"Royal Challengers Banglore");
		 Teams t2= new Teams(1,"IPL",2,"Mumbai Indians");
		 Teams t3= new Teams(1,"IPL",3,"Chennai Super Kings");
		 Teams t4= new Teams(1,"IPL",4,"Lucknow Super Giants");
		 System.out.println(t1);
		 System.out.println(t2);
		 System.out.println(t3);
		 System.out.println(t4);
		 System.out.println();
		 
		 Players P1= new Players(1,"IPL",1,"Royal Challengers Banglore",1,"Virat Kohli","Right Hand Batsman",34);
		 Players P2= new Players(1,"IPL",2,"Mumbai Indian",1,"Rohit Sharma","Right Hand Batsman",36);
		 Players P3= new Players(1,"IPL",3,"Chennai Super Kings",1,"Dhoni","Right Hand Batsman",42);
		 Players P4= new Players(1,"IPL",4,"Lucknow Super Giants",1,"Lokesh Rahul","Right Hand Batsman",31);
		 System.out.println(P1);
		 System.out.println(P2);
		 System.out.println(P3);
		 System.out.println(P4);
	 }
}
