package Arrays;

import java.util.Scanner;

public class FindMinValueinArray {
	
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
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Smallest Value is "+min);
	}

}
