package day_20211203_01;

import java.util.Objects;

public class TestObject {

	public static void main(String[] args) {
		A a1 = new A();
		Object o1 = a1;
		
		String s1 = "abc";
		String s2 = "abc";
		
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);
		
		System.out.println(s1.equals(s3));
		
		A a2 = new A();
		a2.i = 3;
		A a3 = new A();
		a3.i = 3;
		System.out.println(a2==a3);
		System.out.println(a2.equals(a3));
	}

}

class A extends Object{
	int i;

	@Override
	public int hashCode() {
		return Objects.hash(i);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		return i == other.i;
	}
	
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof A) {
//			A a = (A)obj;
//			return this.i == a.i;
//		}
//		return false;
//	}
}

class B{
	
}