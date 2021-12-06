package day_20211203_01;

public class TestString {

	public static void main(String[] args) {
		String s1 = "우리나라 대한민국";
		System.out.println(s1.indexOf("나라"));
		
		String s2 = "012234-1821119";
		System.out.println(s2.charAt(7));
		char gc = s2.charAt(7);
		if(gc=='1'||gc=='3') {
			System.out.println("남자");
		}else if(gc=='2'||gc=='4'){
			System.out.println("여자");			
		}
	}

}
