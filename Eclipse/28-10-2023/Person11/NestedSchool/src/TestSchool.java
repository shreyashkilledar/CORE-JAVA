
public class TestSchool {

	public static void main(String[] args) {

 School s=new School("k.d.s.h patan"," at post patan,tal patan");
 System.out.println(s);
 
 School.Teacher t= s.new Teacher("pandurang","Mathematics","MEBED");
 System.out.println(t);

 
 School.Student st= s.new Student(11,"Bhagyashri",99);
 System.out.println(st);
 
	}

}
