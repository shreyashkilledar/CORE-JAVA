
public class Student {
     private int id;
     private String name;
     private String number;
     
     public Student()
     {
    	 id=0;
    	 name=null;
    	 number=null;
     }
     public Student(int id,String name,String number)
     {
    	 this.id=id;
    	 this.name=name;
    	 this.number=number;
     }
     public void setid(int id) {
    	 this.id=id;
     }
     public void setname(String name) {
    	 this.name=name;
     }
     public void setnumber(String number) {
    	 this.number=number;
     }
     public int getid() {
    	 return this.id;
     }
     public String getname() {
    	 return this.name;
     }
     public String getnumber() {
    	 return this.number;
     }
     public String toString(){
    	 return "id: "+this.id+"\nName: "+this.name+"\nNumber: "+this.number ;
    	 
     }
}
