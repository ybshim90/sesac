package day03;
/** Student.java*/
public class Student {
	private String name;
	private int num;
	
	
	
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setNum(int num) {
//		this.num = num;
//	}
	
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setNum(int num) {
//		this.num = num;
//	}
//	public String getName() {
//		return name;
//	}
//	public int getNum() {
//		return num;
//	}

	Student(String name, int num){
		this.name = name;
		this.num = num;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	void printInfo() {
		System.out.println("name:"+name+",num:"+num);
	}
	
}
