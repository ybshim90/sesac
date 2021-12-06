package project_3;
/** Car.java */
public class Car extends Trans {

	private int seat;

	public Car(String cnum, String name, int cc, int seat) {
		super(cnum, name, cc);
		this.seat = seat;
	}
	
	public Car() {
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+","+seat;
	}
	
	

}
