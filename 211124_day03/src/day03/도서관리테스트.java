package day03;

public class 도서관리테스트 {

	public static void main(String[] args) {
		도서관리 b1 = new 도서관리("혼자하는자바",10000,"홍길동","A출판사");
		도서관리 b2 = new 도서관리("이것이MySQL",15000,"김길동","B출판사");
		
		b1.printInfo();
		b2.printInfo();
		
		System.out.println(b1.get도서명()+" "+b1.get가격());
		System.out.println(b2.get도서명()+" "+b2.get가격());
	}

}
