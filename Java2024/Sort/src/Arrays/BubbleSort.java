package Arrays;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		
		int [] arr= {24,12,-34,-22,14,87,99,67,45};
		
		System.out.print("Given Array: ");
		System.out.print(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.print("Sorted Array: ");
		System.out.print(Arrays.toString(arr));
	}

	private static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
