package StarPatterns;
import java.util.*;
public class Pyramid1 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number: ");
		int num= sc.nextInt();
		for(int i=0;i<num;i++)
		{
			for(int j=num-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}

			
