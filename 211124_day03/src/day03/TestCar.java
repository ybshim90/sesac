package day03;

public class TestCar {
	public static void main(String[] args) {
//		Car c1 = new Car();
//		c1.type = "cuv";
//		c1.name = "ĳ����";
//		c1.cc = 1.0;
		
		Car c1 = new Car("cuv","ĳ����",1.0);
//		System.out.println(c1);
		c1.printInfo();

		Car c2 = new Car("suv","�ҷ�Ʈ",1.6);
		c2.printInfo();
//		Car c2 = new Car();
//		c2.type = "suv";
//		c2.name = "�ҷ�Ʈ";
//		c2.cc = 1.6;
		
		System.out.println(c1.type+" "+c1.name+" "+c1.cc);
		System.out.println(c2.type+" "+c2.name+" "+c2.cc);
		
	}
	

}
