
public class Bank {
	
	private String bname;
	private String badd;
	
		public class Saving
		{
			private String sname;
			private String sacc;
			private double srate;
			public Saving() {
				super();
			}
			public Saving(String sname, String sacc, double srate) {
				super();
				this.sname = sname;
				this.sacc = sacc;
				this.srate = srate;
			}
			public String getSname() {
				return sname;
			}
			public void setSname(String sname) {
				this.sname = sname;
			}
			public String getSacc() {
				return sacc;
			}
			public void setSacc(String sacc) {
				this.sacc = sacc;
			}
			public double getSrate() {
				return srate;
			}
			public void setSrate(double srate) {
				this.srate = srate;
			}
			@Override
			public String toString() {
				return "Saving [sname=" + sname + ", sacc=" + sacc + ", srate=" + srate + "]";
			}
			
			
		}
		
		public class Current
		{
			private String cname;
			private String cacc;
			private double crate;
			public Current() {
				super();
			}
			public Current(String cname, String cacc, double crate) {
				super();
				this.cname = cname;
				this.cacc = cacc;
				this.crate = crate;
			}
			public String getCname() {
				return cname;
			}
			public void setCname(String cname) {
				this.cname = cname;
			}
			public String getCacc() {
				return cacc;
			}
			public void setCacc(String cacc) {
				this.cacc = cacc;
			}
			public double getCrate() {
				return crate;
			}
			public void setCrate(double crate) {
				this.crate = crate;
			}
			@Override
			public String toString() {
				return "Current [cname=" + cname + ", cacc=" + cacc + ", crate=" + crate + "]";
			}
			
			
		}

		public Bank() {
			super();
		}

		public Bank(String bname, String badd) {
			super();
			this.bname = bname;
			this.badd = badd;
		}

		public String getBname() {
			return bname;
		}

		public void setBname(String bname) {
			this.bname = bname;
		}

		public String getBadd() {
			return badd;
		}

		public void setBadd(String badd) {
			this.badd = badd;
		}

		@Override
		public String toString() {
			return "Bank [bname=" + bname + ", badd=" + badd + "]";
		}
}
