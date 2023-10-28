class MinArray{
    public static void main(String []args)
    {
        int [][]arr={{5,7},{9,4}};
        System.out.println("min no="+ getMinNumber(arr));
    }
    public static int getMinNumber(int [][]arr)
    {
        int minNumber=arr[0][0];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if (arr[i][j]<minNumber)
                {
                    minNumber=arr[i][j];
                }
            }
        }
        return minNumber;
    }

}

