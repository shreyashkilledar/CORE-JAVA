
public class Wrapper {
public static void main(String[] args) {
	Integer ob=56;
	int ob1=52;
	System.out.println("ob:"+ob);
    System.out.println("ob1:"+ob1);
    ob=ob1;//boxing
    System.out.println("boxing:"+ob);
    ob1=ob;
    System.out.println("unboxing:"+ob1);
	
}
}
