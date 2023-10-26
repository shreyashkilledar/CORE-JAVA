import java.util.Arrays;
import java.util.Scanner;
class Array6{
    public static void main(String []args)
    {
        Scanner s=new Scanner (System.in);
        int arr[][]={{1,6,3},{7,3,1},{7,6,3}};
        System.out.println("Array= "+Arrays.deepToString(arr));
        System.out.print("enter a no = ");
        int a=s.nextInt();
        System.out.println("occurance of "+ a +" = " + findOccurrences(arr,a) +" times.");
        s.close();
    }
    public static int findOccurrences(int arr[][],int a)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(a==arr[i][j])
                {
                    count++;
                }
            }
        }
        return count;
    }
}