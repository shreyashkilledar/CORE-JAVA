
public class Person {

	private int pid;
	private String name;
	private String number;
	
public Person()
{
	pid=0;
	name=null;
	number=null;
}
public Person(int pid,String name,String number)
{
	this.pid=pid;
	this.name=name;
	this.number=number;
}
public void setpid(int pid) {
	this.pid=pid;
}
public void setname(String name) {
	this.name=name;
}
public void setnumber(String number) {
	this.number=number;
}
public int getpid() {
	return this.pid;
}
public String getname() {
	return this.name;
}
public String getnumber() {
	return this.number;
}
public void displayPerson() {
	System.out.println("pid="+pid);
	System.out.println("name="+name);
	System.out.println("number="+number);
}
}


