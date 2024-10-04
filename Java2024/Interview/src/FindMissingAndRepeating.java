import java.util.*;
public class FindMissingAndRepeating {
	public static void findMissingAndRepeating(int [] arr)
	{
		int [] count= new int[arr.length+1];
		
		for(int i=0;i<arr.length;i++)
		{
			count[arr[i]]++;
		}
		
		int missing=-1,repeating=-1;
		
		for(int i=0;i<=arr.length;i++)
		{
			if(count[i]==0)
			{
				missing=i;
			}
			else if(count[i]>1)
			{
				repeating=i;
			}
		}
		System.out.println("Missing "+missing+", Repeating "+repeating);
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num= sc.nextInt();
		int [] arr= new int[num];
		System.out.println("Enter array elements");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		findMissingAndRepeating(arr);
		
	}

}

