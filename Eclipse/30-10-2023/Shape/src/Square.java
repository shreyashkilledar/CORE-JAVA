import java.util.Scanner;
public class Square {
	private int side;
	private int area;
	public Square() 
	{
		System.out.println("Default Square");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the side of the Square");
		side= sc.nextInt();
		area= side*side;
		System.out.println("Area of Square is "+ area);
	}
	public Square(int side) {
		
		area= side*side;
		System.out.println("Area of Square is "+ area);
		this.side = side;
		this.area = area;
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String toString() {
		return "Square [side=" + side + ", area=" + area + "]";
	}
}
