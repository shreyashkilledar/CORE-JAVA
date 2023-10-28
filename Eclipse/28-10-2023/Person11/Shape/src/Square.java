import java.util.Scanner;
public class Square {
	private int side;
	private int area;
	public Square() 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Side of Square");
		int side= sc.nextInt();
		area=side*side;
		System.out.println("Area of user defined side is");
		
	}
	public Square(int side) 
	{
		this.side=side;
		area=side*side;
		System.out.println();
		System.out.println("Area of Predefined side is");
	}
	public int getSide() 
	{
		return side;
	}
	public void setSide(int side) 
	{
		this.side = side;
	}
	public String toString()
	{
		return "Square[Area= "+area+"]";
	}
}
