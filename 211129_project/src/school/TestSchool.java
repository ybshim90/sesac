package school;

public class TestSchool {

	public static void main(String[] args) {
//		�б�����
//		�л� : �̸�,�й�,�а�
//		���� : �̸�,���,�μ�
//		���� : �̸�,����,����
		
		Student s1 = new Student("ȫ�浿","�İ�",1112);
//		Student s2 = new Student("ȫ�浿",1112,"�İ�");
		
		Emp e1 = new Emp("��븮","�ѹ���",9011);
		
		Person p1 = new Person("��浿",1113);
		
		MyStudent ms1 = new MyStudent("��浿",1113,"�İ�");
		ms1.printInfo();
		
		MyEmp me1 = new MyEmp("�ڴ븮",9011,"�ѹ���");
		me1.printInfo();
		
//		MyTeacher mt1 = new MyTeacher("�ֱ���",88013,"������");
//		mt1.printInfo();
		
	}

}
