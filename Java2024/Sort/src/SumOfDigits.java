import java.util.*;
public class SumOfDigits {
	public static void main(String[] args) {
		
		int num,sum=0,rem;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number: ");
		num= sc.nextInt();
		while(num>0)
		{
			rem=num%10;
			sum=rem+sum;
			num=num/10;
		}
		System.out.println("The sum of number is "+sum);
		
	}

}
