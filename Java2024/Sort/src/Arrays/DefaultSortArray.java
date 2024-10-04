package Arrays;

import java.util.Arrays;

public class DefaultSortArray {
	public static void main(String[] args) {
		
		int [] arr= {-2,3,2,-4,-5,-4,4};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]+" ");
		}
	}

}
