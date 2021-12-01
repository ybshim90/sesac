package school;

public class TestSchool {

	public static void main(String[] args) {
//		학교정보
//		학생 : 이름,학번,학과
//		직원 : 이름,사번,부서
//		교수 : 이름,교번,전공
		
		Student s1 = new Student("홍길동","컴공",1112);
//		Student s2 = new Student("홍길동",1112,"컴공");
		
		Emp e1 = new Emp("김대리","총무부",9011);
		
		Person p1 = new Person("김길동",1113);
		
		MyStudent ms1 = new MyStudent("김길동",1113,"컴공");
		ms1.printInfo();
		
		MyEmp me1 = new MyEmp("박대리",9011,"총무부");
		me1.printInfo();
		
//		MyTeacher mt1 = new MyTeacher("최교수",88013,"연구동");
//		mt1.printInfo();
		
	}

}
