import java.util.Scanner;
public class Rectangle {
	private int length;
	private int breadth;
	private int area;
	public Rectangle()
	{
		System.out.println("Default of Rectangle");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		length=sc.nextInt();
		System.out.println("Enter the breadth of the rectangle");
		breadth=sc.nextInt();
		area= length*breadth;
		System.out.println("Area of Rectangle"+ area);
	}
	public Rectangle(int length, int breadth) 
	{
		this.length = length;
		this.breadth = breadth;
		this.area = area;
		area= length*breadth;
		System.out.println("Area of Rectangle"+ area);
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", area=" + area + "]";
	}
}
