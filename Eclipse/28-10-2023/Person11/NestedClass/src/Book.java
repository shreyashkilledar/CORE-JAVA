public class Book {
	private int bkid;
	private String bname;
	private String bauthor;
		public class Lesson
		{
			private int Lid;
			private String Lname;
			public void show1()
			{
				System.out.println("Default Constructor");
			}
		}
	public Book()
	{
		System.out.println("Default Constructor");
	}
	public Book(int bkid, String bname, String bauthor)
	{
		this.bkid=bkid;
		this.bname=bname;
		this.bauthor=bauthor;
	}
	public void show()
	{
		System.out.println("Book ID="+bkid);
		System.out.println("Book Name="+bname);
		System.out.println("Book Author="+bauthor);
	}
	public int getBkid() {
		return bkid;
	}
	public void setBkid(int bkid) {
		this.bkid = bkid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public String toString()
	{
		return "Book[bkid= "+bkid+", bname= "+bname+", bauthor= "+bauthor+"]";
	}
}
