package school;

public class Student {
	private String name, hakgwa;
	private int hakbun;
		
	public Student() {
		
	}

	public Student(String name, String hakgwa, int hakbun) {
		super();
		this.name = name;
		this.hakgwa = hakgwa;
		this.hakbun = hakbun;
	}
	
	public Student(String name, int hakbun, String hakgwa) {
//		super();
//		this.name = name;
//		this.hakgwa = hakgwa;
//		this.hakbun = hakbun;
		this(name,hakgwa,hakbun);
	}
	
	public Student(int hakbun, String name, String hakgwa) {
		this(name,hakgwa,hakbun);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHakgwa() {
		return hakgwa;
	}

	public void setHakgwa(String hakgwa) {
		this.hakgwa = hakgwa;
	}

	public int getHakbun() {
		return hakbun;
	}

	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	
	public void printInfo() {
		System.out.println(name+","+hakbun+","+hakgwa);
	}
}
