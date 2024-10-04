import java.util.*;
public class Prime {
	public static void main(String[] args) {
		int n,m=0,flag=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number: ");
		n= sc.nextInt();
		m=n/2;
		if(n==0 || n==1)
		{
			System.out.println(n+" is not prime number");
		}
		else
		{
			for(int i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+" is not prime number.");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(n+" is Prime number.");
			}
		}
	}
}
