
public class Trainer extends Teacher{
	
	private int trID;
	private String trName;
	private String SP;
	public Trainer() {
		super();
	}
	public Trainer(String sname, String sadd,String tname, String desg, int tsal,int trID, String trName, String sP) {
		super( sname,  sadd, tname,  desg,  tsal);
		this.trID = trID;
		this.trName = trName;
		SP = sP;
	}
	public int getTrID() {
		return trID;
	}
	public void setTrID(int trID) {
		this.trID = trID;
	}
	public String getTrName() {
		return trName;
	}
	public void setTrName(String trName) {
		this.trName = trName;
	}
	public String getSP() {
		return SP;
	}
	public void setSP(String sP) {
		SP = sP;
	}
	@Override
	public String toString() {
		return super.toString()+"Trainer [trID=" + trID + ", trName=" + trName + ", SP=" + SP + "]";
	}
	
	

}
