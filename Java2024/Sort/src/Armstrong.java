import java.util.*;
public class Armstrong {
	public static void main(String[] args) {
		
		int num, sum=0, rem, temp;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number to check: ");
		num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(sum==temp)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}
	}

}
