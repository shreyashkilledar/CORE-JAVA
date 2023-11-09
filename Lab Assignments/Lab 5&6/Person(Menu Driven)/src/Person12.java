
public class Person12 {
	private int id;
	private String name;
	private String Mobile;
	private String email;
	public Person12() {
		super();
	}
	public Person12(int id, String name, String mobile, String email) {
		super();
		this.id = id;
		this.name = name;
		Mobile = mobile;
		this.email = email;
	}
	public int getPid() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Person12 [id=" + id + ", name=" + name + ", Mobile=" + Mobile + ", email=" + email + "]";
	}
   
	
}
