package project_01;

public class TestNested {
	
	int i=5;
	static int j =7;

	public static void main(String[] args) {
//		MyStudent st1 = new MyStudent();
//		MyEmp e1 = new MyEmp();
		System.out.println(j);
//		System.out.println(i);
		
		MyEmp e1 = new MyEmp();
	}
	
	static class MyEmp{
		String name, dept;
	}

}
