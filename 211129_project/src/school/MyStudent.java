package school;

public class MyStudent extends Person{
	

	private String hakgwa;

	public MyStudent(String name, int no, String hakgwa) {
		this.hakgwa = hakgwa;
		setName(name);
		setNo(no);
		
	}

	public String getHakgwa() {
		return hakgwa;
	}

	public void setHakgwa(String hakgwa) {
		this.hakgwa = hakgwa;
	}
	
	
	
}
