package project_2;

public class Circle extends Shape{

	private int r;

	public Circle(String color, int x1, int y1, int r) {
		super(color,x1,y1);
		this.r = r;
	}
	
	public Circle() {
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public String getInfo() {
		return super.getInfo()+","+r;
	}

}
