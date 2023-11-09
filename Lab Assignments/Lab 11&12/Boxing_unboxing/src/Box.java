
public class Box {

	public static void main(String[] args) {
		
		//boxing & unboxing
		Integer a=10;
		int b=20;
		
		a=b;// wrapper<-primitive	//boxing
		b=a;// primitive<-wrapper	//unboxing
		System.out.println(a+" "+b);
		System.out.println("Using methods of wrapper class ValueOf "+Integer.valueOf(b));
		Boolean B = Boolean.valueOf("true");
		System.out.println("Using methods of wrapper class ValueOf "+String.valueOf(B));
		int i = Integer.parseInt("10");
		System.out.println("Using methods of wrapper class Parse "+i);
		
		
		//string manipulation methods
		System.out.println();
		String s1="Abhishek";
		String s2="Shreyash";
		String s3="Karad";
		String s4="Kolhapur";

		System.out.println("Check both referances(s1,s2) pointing same object 'Abhishek' ");
		System.out.println(s1==s2);
		System.out.println();
		
		System.out.println("Check both referances(s1,s2) have same string ");
		System.out.println("s1 equals s2 :"+s1.equals(s2));
		System.out.println();
		
		System.out.println("Printing First letter using CharAt");
		System.out.println("First letter :"+s1.charAt(0));
		System.out.println();
		
		System.out.println("Concate two string");
		System.out.println("concate:"+s1.concat(s3));
		System.out.println();
		
		System.out.println("use CompareTo (1st string length is greater then return 1 and length is same then return 0 and length is small then retrun -1 )");
		System.out.println("CompareTo :"+s1.compareTo(s3));
		System.out.println("CompareTo :"+s4.compareTo(s2));
		System.out.println();
		System.out.println();
		
		System.out.println("lowercase string");
		System.out.println("lowercase:"+s1.toLowerCase());
		System.out.println();System.out.println();
		
		System.out.println("uppercase string");
		System.out.println("Uppercase:"+s1.toUpperCase());
		System.out.println();
		
		
	}

}
