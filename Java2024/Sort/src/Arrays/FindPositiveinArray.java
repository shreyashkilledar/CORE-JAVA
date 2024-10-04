package Arrays;

public class FindPositiveinArray {
	public static void main(String[] args) {
		
		int [] arr= {-2,3,2,-4,-5,-4,4};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				System.out.print(" "+arr[i]+" ");
				count+=1;
			}
		}
		System.out.println();
		System.out.println("Total positive numbers are "+count);
	}

}
