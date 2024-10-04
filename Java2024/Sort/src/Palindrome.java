import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		
		int num,rev=0,rem,temp;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number to check: ");
		num= sc.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=rem+(rev*10);
			num=num/10;
		}
		if(rev==temp)
		{
			System.out.println("Number is Palindrome.");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
	}
}
