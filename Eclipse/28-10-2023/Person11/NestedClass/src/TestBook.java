
public class TestBook {

	public static void main(String[] args) {
		Book b= new Book(1,"MongoDB","SALLEM");
		b.show();
		
		Book b1= new Book(2,"DBT","Saleel");
		b1.show();
		
		Book b2= new Book(3,"SQL","SALEEL");
		System.out.println(b2);
	
		Book.Lesson l= b.new Lesson();
		l.show1();
		
		OuterClass o= new OuterClass();
		o.display1();
		
		OuterClass.Innerclass i=o.new Innerclass();
		i.display();
	}

}
