package project_3;
/** Trans.java */
public class Trans {
	
	private String cnum;
	private String name;
	private int cc;

	public Trans(String cnum, String name, int cc) {
		this.cnum = cnum;
		this.name = name;
		this.cc = cc;
		
	}
	
	public Trans() {
	}

	public String getCnum() {
		return cnum;
	}

	public void setCnum(String cnum) {
		this.cnum = cnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public String getInfo() {
		return cnum+","+name+","+cc;
	}
	
	

}
