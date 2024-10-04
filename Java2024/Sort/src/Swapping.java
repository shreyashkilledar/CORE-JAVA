import java.util.*;
public class Swapping {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter A: ");
		int A=sc.nextInt();
		System.out.print("Enter B: ");
		int B=sc.nextInt();
		System.out.println("Before Swapping A= "+A+", B= "+B);
		
//		With 3RD variable
//		int C=A;
//		A=B;
//		B=C;
		
//		Without 3rd variable
//		A=A+B;
//		B=A-B;
//		A=A-B;
		
		System.out.println("After Swapping A= "+A+", B= "+B);
	}

}
