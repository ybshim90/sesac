package day03;
/** TestStudent.java*/
public class TestStudent {

	public static void main(String[] args) {

		Student s1 = new Student("ȫ�浿",1122);
		s1.setName("���浿");
		s1.setNum(1112);
		System.out.println(s1.getName()+" "+s1.getNum());
		Student s2 = new Student("��浿",2233);
		s1.printInfo();
		s2.printInfo();
//		System.out.println(s1.name+" "+s1.num);
//		System.out.println(s2.name+" "+s2.num);
		
	}

}
