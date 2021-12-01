package project_1;

public class Student extends Person{

	private String hakgwa;

	public Student(String name, String tel, String hakgwa) {
		super(name, tel);
		this.hakgwa = hakgwa;
	}

	public String getHakgwa() {
		return hakgwa;
	}

	public void setHakgwa(String hakgwa) {
		this.hakgwa = hakgwa;
	}
	
//	public void printInfo() {
//		System.out.println(getName()+","+getTel()+","+hakgwa);
//	}
	
	@Override
	public void printInfo() {
		System.out.println(getName()+","+getTel()+","+hakgwa);
	}

}
