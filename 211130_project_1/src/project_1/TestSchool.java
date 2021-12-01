package project_1;

public class TestSchool {

	public static void main(String[] args) {
		Student st1 = new Student("È«±æµ¿","111-222","ÄÄ°ø");
		st1.printInfo();
		
		Emp e1 = new Emp("±è´ë¸®","111-223","ÃÑ¹«ºÎ");
		e1.printInfo();
		
		Person p1 = st1;
	}
}
