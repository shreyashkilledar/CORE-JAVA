package TeamPackage;

public class Player {

	private int Pno;
	private String name;
	private String skill;
	public Player() {
		super();
	}
	public Player(int pno, String name, String skill) {
		super();
		Pno = pno;
		this.name = name;
		this.skill = skill;
	}
	public int getPno() {
		return Pno;
	}
	public void setPno(int pno) {
		Pno = pno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "Player [Pno=" + Pno + ", name=" + name + ", skill=" + skill + "]";
	}
	
	
}
