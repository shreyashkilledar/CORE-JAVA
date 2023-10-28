
public class School {
	private String sname;
	private String sadd;
	
	public class Teacher{
		
		private String tname;
		private String tsub;
		private String tqual;
		
		public Teacher()
		{
			System.out.println(" default teacher");
		}
		public Teacher(String tname,String tsub,String tqual )
		{
			this.tname=tname;
			this.tsub=tsub;
			this.tqual=tqual;
		}
		public String getTname() {
			return tname;
		}
		public void setTname(String tname) {
			this.tname = tname;
		}
		public String getTsub() {
			return tsub;
		}
		public void setTsub(String tsub) {
			this.tsub = tsub;
		}
		public String getTqual() {
			return tqual;
		}
		public void setTqual(String tqual) {
			this.tqual = tqual;
		}
		
		
		public String toString()
		{
			return "Teacher[tname="+tname +" ,tsub="+tsub +" ,tqual="+tqual+"]"; 
		}
		
	}
		
		public class Student{
			private int srno;
			private String sname;
			private int smarks;
			
			public Student()
			{
				System.out.println(" Default student");
			}
	public Student (int srno,String sname,int smarks)
	{
		this.srno=srno;
		this.sname=sname;
		this.smarks=smarks;
	}
	public int getSrno() {
		return srno;
	}
	public void setSrno(int srno) {
		this.srno = srno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSmarks() {
		return smarks;
	}
	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}
	
	
	public String toString()
	{
		return "Student[srno="+srno+", sname="+sname+", smarks="+smarks+"]";
	}
	
		}
		
		
		
public School()
{
	System.out.println("default constructor");
}
public School(String sname,String sadd)
{
	this.sname=sname;
	this.sadd=sadd;
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

public String toString()
{
	return "School[sname="+sname+",sadd="+sadd+"]";
}

}

