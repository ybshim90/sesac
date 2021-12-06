package project;

public class TestExtends {
	public static void main(String[] args) {
		B b1 = new B();
		b1.name = "홍길동";
		b1.age = 30;
		
		C c1 = new C();
		c1.name = "김길동";
		c1.tel = "111-222";
		
		A a1 = b1;
		a1.name = "박길동";
		System.out.println(a1 instanceof B);
		if (a1 instanceof B) {
			System.out.println("a1은B타입");
			B b2 = (B)a1;
			b2.age = 35;
		}
		System.out.println(a1 instanceof C);
		a1 = c1;
		if (a1 instanceof C) {
			System.out.println("a1은C타입");
			C c2 = (C)a1;
			c2.tel = "222-333";
		}
	}

}

class A{
	String name;
	public String getInfo() {
		return name;
	}
}

class B extends A{
	int age;
	public String getInfo() {
		return super.getInfo()+","+age;
	}
}

class C extends A{
	String tel;
	public String getInfo() {
		return super.getInfo()+","+tel;
	}
}