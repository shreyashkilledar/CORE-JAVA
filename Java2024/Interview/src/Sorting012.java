import java.util.*;
public class Sorting012 {
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
		
		
		Sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void Sort(int[] arr)
	{
		int low=0,mid=0,high=arr.length-1;
		while(mid<=high)
		{
			if(arr[mid]==0)
			{
				swap(arr,low,mid);
				low++;
				mid++;

			}
			else if(arr[mid]==1)
			{
				mid++;
			}
			else
			{
				swap(arr,mid,high);
				high--;
			}
		}
	}
	
	public static void swap(int [] arr, int i, int j)
	{
		int temp= arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	

}
