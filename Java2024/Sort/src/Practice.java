//public class Practice
//{
//	 public static void main(String[] args) 
//	 {
//	        int[] arr = {4, 3, 6, 2, 1, 1};
//	        findMissingAndRepeating(arr);
//	  }
//
//	    static void findMissingAndRepeating(int[] arr) 
//	    {
//	        int n = arr.length;
//	        int repeating = -1, missing = -1;
//
//	        // Step 1: Find the repeating element
//	        for (int i = 0; i < n; i++) 
//	        {
//	            int index = Math.abs(arr[i]) - 1;
//	            if (arr[index] < 0) 
//	            {
//	                repeating = index + 1; // Found the repeating number
//	            } 
//	            else 
//	            {
//	                arr[index] = -arr[index]; // Mark the number as visited
//	            }
//	        }
//
//	        // Step 2: Find the missing element
//	        for (int i = 0; i < n; i++) 
//	        {
//	            if (arr[i] > 0) 
//	            {
//	                missing = i + 1; // The index + 1 is the missing number
//	                break;
//	            }
//	        }
//	        System.out.println("Missing = " + missing + ", Repeating = " + repeating);
//	    }
//}
import java.util.*;
public class Practice{
	public static void main(String[] args) {
		
		int [] arr= {34,26,-54,99,-43,76,-56,47,76};
		System.out.println("Before sorting ");
		System.out.println(Arrays.toString(arr));
		
		bubbleSort(arr);
		
		System.out.println("After sorting ");
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}
	
	public static void bubbleSort(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}




























