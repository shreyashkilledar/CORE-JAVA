class MatrixTranspose{
    public static void main(String []args){
        int old[][] ={{1,3,6},{5,6,8},{7,4,9}};
        int transpose[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                transpose[i][j]=old[j][i];
            }
        }
        System.out.println("old matrix is");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(old[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println("transpose matrix is");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(transpose[i][j]+" ");

            }
            System.out.println();

        }

    }
}