package project_3;
/** Truck.java */
public class Truck extends Trans {
	
	private int contain;

	public Truck(String cunm, String name, int cc, int contain) {
		super(cunm, name, cc);
		this.contain = contain;
		
	}
	
	public Truck() {
	}

	public int getContain() {
		return contain;
	}

	public void setContain(int contain) {
		this.contain = contain;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+","+contain;
	}

}
