package bank1;

public class Saving extends Account
{
	private int acno;
	private double rate;
	public Saving() {
		super();
	}
	public Saving(int acno, double rate,String ifsc, String bname, String badd, String name) {
		super(ifsc,bname,badd,name);
		this.acno = acno;
		this.rate = rate;
	}
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return super.toString()+"Saving [acno=" + acno + ", rate=" + rate + "]";
	}
	
	
	
}
