package day03;

public class TestMyCalc {

	public static void main(String[] args) {

		MyCalc mc = new MyCalc();
		mc.add(5);//누적
		mc.add(7);
//		mc.total = 100;
//		System.out.println(mc.total);
		System.out.println(mc.getTotal());
		
		int r = mc.plus(5,7);//더하기
		System.out.println(r);
		int r2 = mc.add(5,7);
		System.out.println(r2);
	}

}
