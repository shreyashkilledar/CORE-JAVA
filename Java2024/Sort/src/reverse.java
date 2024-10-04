import java.util.*;
public class reverse {
	public static void main(String[] args) {
		int num,rev=0,rem;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number: ");
		num= sc.nextInt();
		while(num>0)
		{
			rem=num%10;
			rev=rem+(rev*10);
			num=num/10;	
		}
		System.out.println("Reverse Number is "+rev);
	}

}
