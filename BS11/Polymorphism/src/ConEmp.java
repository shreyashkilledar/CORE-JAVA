
public class ConEmp extends Employee
{
	private int hrs;
	private int rate;
	public ConEmp() {
		super();
	}
	public ConEmp(int eid, String dept, String desg,int hrs, int rate) {
		super( eid,  dept,  desg);
		this.hrs = hrs;
		this.rate = rate;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return super.toString()+"ConEmp [hrs=" + hrs + ", rate=" + rate + "]";
	}
	
	public int calculateSal()
	{
		return hrs*rate;
	}

}
