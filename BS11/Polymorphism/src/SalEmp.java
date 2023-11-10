
public class SalEmp extends Employee{
	
	private int sal;
	private int bonus;
	public SalEmp() {
		super();
	}
	public SalEmp(int eid, String dept, String desg,int sal, int bonus) {
		super( eid,  dept,  desg);
		this.sal = sal;
		this.bonus = bonus;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return super.toString()+"SalEmp [sal=" + sal + ", bonus=" + bonus + "]";
	}
	
	public int calculateSal()
	{
		return sal+bonus;
	}
	
	

}
