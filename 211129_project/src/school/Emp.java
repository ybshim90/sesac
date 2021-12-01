package school;

public class Emp {
	private String name, buseo;
	private int sabun;
	
	public Emp() {
		
	}

	public Emp(String name, String buseo, int sabun) {
		super();
		this.name = name;
		this.buseo = buseo;
		this.sabun = sabun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBuseo() {
		return buseo;
	}

	public void setBuseo(String buseo) {
		this.buseo = buseo;
	}

	public int getSabun() {
		return sabun;
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	
	public void printInfo() {
		System.out.println(name+","+buseo+","+sabun);
	}
	
	

}
