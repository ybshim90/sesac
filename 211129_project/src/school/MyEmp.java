package school;

public class MyEmp extends Person{
	
	private String dept;

	public MyEmp(String name, int no, String dept) {
		this.dept = dept;
		setName(name);
		setNo(no);
	}

}
