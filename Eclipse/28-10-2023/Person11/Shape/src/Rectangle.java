import java.util.Scanner;
public class Rectangle 
{
	private int length;
	private int breadth;
	private int area; 
	public Rectangle() 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println();
		System.out.println("Enter the Length of Rectangle");
		int length= sc.nextInt();
		System.out.println("Enter the Breadth of Rectangle");
		int breadth= sc.nextInt();
		area=breadth*length;
		System.out.println("Area of user defined Length & Breadth is");		
	}
	public Rectangle(int length, int breadth) 
		{
			this.length=length;
			this.breadth=breadth;
			area=length*breadth;
			System.out.println();
			System.out.println("Area of Predefined side is");
		}
	public int getLength() 
	{
	return length;
	}
	public void setLength(int length) 
	{
		this.length = length;
	}
	public int getBreadth() 
	{
		return breadth;
	}
	public void setBreadth(int breadth) 
	{
		this.breadth = breadth;
	}
		public String toString()
		{
			return "Rectangle[Area= "+area+"]";
		}
	}


