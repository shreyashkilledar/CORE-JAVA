import java.util.Scanner;
class Table{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number=");
        int num= sc.nextInt();
        System.out.println("The table of "+num+ " is");
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"*"+i+"="+(num*i));
        }
    }
}