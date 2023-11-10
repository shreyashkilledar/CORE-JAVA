import java.util.Scanner;
public class Shape {
	
	private int square;
	private int rectangle;
	private int circle;
	private int side;
	private int len,bre;
	private int rad;
	
	public Shape()
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("It is Square.");
		System.out.println("Enter Side of square");
		int side=sc.nextInt();
		int Area=side*side;
		System.out.println("Area of square="+Area);
		System.out.println();
		
		System.out.println("It is Rectangle");
		System.out.println("Enter the length of the rectangle");
		int len=sc.nextInt();
		System.out.println("Enter the breadth of rectangle");
		int bre=sc.nextInt();
		int Area1=len*bre;
		System.out.println("Area of Rectangle="+Area1);
		System.out.println();
		
		System.out.println("It is Circle");
		System.out.println("Enter the Radius");
		int rad=sc.nextInt();
		double Area2=3.142*rad*rad;
		System.out.println("Area of Circle="+Area2);
	}

	public static void main(String[] args) {
		
		Shape s= new Shape();
		
	}
}

