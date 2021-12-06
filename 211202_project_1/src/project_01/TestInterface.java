package project_01;

public class TestInterface {

	public static void main(String[] args) {
		FlyStudent st1 = new FlyStudent("È«±æµ¿","ÄÄ°ø");
		System.out.println(st1.getInfo());
		st1.fly();
		
		Flyable f1 = st1;
		f1.fly();
	}

}

class MyStudent{
	String name,hakgwa;
	
	public String getInfo() {
		return name+","+hakgwa;
	}
}

class FlyStudent extends MyStudent implements Flyable{
	public FlyStudent(String name, String hakgwa) {
		this.name = name;
		this.hakgwa = hakgwa;
	}

	public void fly() {
		System.out.println("fly");
	}
}

interface Flyable{
	void fly();
}