package project_1;

public class TestSchool {

	public static void main(String[] args) {
		Student st1 = new Student("ȫ�浿","111-222","�İ�");
		st1.printInfo();
		
		Emp e1 = new Emp("��븮","111-223","�ѹ���");
		e1.printInfo();
		
		Person p1 = st1;
	}
}
