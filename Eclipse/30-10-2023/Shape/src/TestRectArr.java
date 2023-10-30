import java.util.Scanner;
public class TestRectArr {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int choice =0;
		do
		{
			System.out.println("1. Square\n 2. Rectangle");
			choice= sc.nextInt();
			switch(choice)
			{
			case 1:
				Square s1= new Square();
				System.out.println(s1);
				
				Square s2= new Square(5);
				System.out.println(s2);
				break;
			case 2:
				Rectangle r= new Rectangle ();
				System.out.println(r);
				
				Rectangle r1= new Rectangle(5,6);
				System.out.println(r1);
				break;
			default:
				System.out.println("Invalid input");
				
			}
		}
		while(choice>2);
		{
			System.out.println("Enter number<3");
		}
	}
}
