package project_01;

public class TestExtends {

	public static void main(String[] args) {
		Student st1 = new Student("홍길동",21,"컴공");
		
		Person p1 = st1;
		
		Emp e1 = new Emp("김길동",35,"개발");
		p1 = e1;
		
		Emp e2 = (Emp)p1;
		st1 = (Student)p1;
	}

}

class Person{
	private String name;
	private int age;
	
//	public Person() {
//		System.out.println("생성");
//	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person() {
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getInfo() {
		return name+","+age;
	}
}

class Emp extends Person{
	String dept;
	public Emp(String name, int age, String dept) {
		super(name,age);
		this.dept=dept;
	}
	
	public String getInfo() {
		return super.getInfo()+","+dept;
	}
	
}

class Student extends Person{
	String hakgwa;
	
	public Student(String name, int age, String hakgwa) {
		super(name,age);
		this.hakgwa=hakgwa;
	}

	//	public Student() {
//		super();
//	}
//	
	public String getInfo() {
		return super.getInfo()+","+hakgwa;
	}
	
}