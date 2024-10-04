package Arrays;
import java.util.*;
public class FindMaxValueinArray {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num= sc.nextInt();
		System.out.println("Enter elements: ");
		int [] arr= new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Greatest Value is "+max);
	}
	
}
