import java.util.Arrays;
class Array{
    public static void main(String[] args){
        int[] arr1={10,50};
        int[] arr2={80,90};
        int f1=arr1.length;
        int f2=arr2.length;
        int[] z =new int[f1+f2]; 
        System.arraycopy(arr1, 0, z, 0, f1);
        System.arraycopy(arr2, 0, z, f1, f2);
        System.out.println(Arrays.toString(z));

    }
}