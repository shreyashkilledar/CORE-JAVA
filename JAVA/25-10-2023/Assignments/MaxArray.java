class MaxArray{
    public static void main(String []args)
    {
        int [][]arr={{5,7},{9,4}};
        System.out.println("max no="+ getMaxNumber(arr));
    }
    public static int getMaxNumber(int [][]arr)
    {
        int maxNumber=arr[0][0];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if (arr[i][j]>maxNumber)
                {
                    maxNumber=arr[i][j];
                }
            }
        }
        return maxNumber;
    }

}