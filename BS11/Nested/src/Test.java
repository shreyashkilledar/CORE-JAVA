
public class Test {
	public static void main(String[] args) 
	{
		
		Bank b= new Bank("HDFC","Karad");
		System.out.println(b);
		
		Bank.Saving s= b.new Saving("Shreyash","3214563215",9.8);
		System.out.println(s);
		
		Bank.Current c= b.new Current("Rutvik","5434643464",5.2);
		System.out.println(c);
	}
}
