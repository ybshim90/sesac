package day03;

public class 도서관리 {
	private String 도서명;
	private int 가격;
	private String 저자명;
	private String 출판사;
	
	public String get도서명() {
		return 도서명;
	}
	public void set도서명(String 도서명) {
		this.도서명 = 도서명;
	}
	public int get가격() {
		return 가격;
	}
	public void set가격(int 가격) {
		this.가격 = 가격;
	}
	public String get저자명() {
		return 저자명;
	}
	public void set저자명(String 저자명) {
		this.저자명 = 저자명;
	}
	public String get출판사() {
		return 출판사;
	}
	public void set출판사(String 출판사) {
		this.출판사 = 출판사;
	}
	
	도서관리(String 도서명, int 가격, String 저자명, String 출판사){
		this.도서명 = 도서명;
		this.가격 = 가격;
		this.저자명 = 저자명;
		this.출판사 = 출판사;
	}
	
	void printInfo() {
		System.out.println(도서명+" "+가격+" "+저자명+" "+출판사);
	}
	
}
