package project_01;

public class TestEcxeption {

	public static void main(String[] args) {
		try {
			String s = "a";
			System.out.println(s.length());
			System.out.println("정상");
			
			int [] arr = new int[10];
			arr[0] = 10;
			arr[2] = 20;
//			arr[10] =100;

		}catch(NullPointerException e) {
			System.out.println("null");			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("index");			
		}catch(Exception e) {
			System.out.println("기타");
		}
//		if(s !=null) {
//		}else {
//		}
//		System.out.println(s.length());
		System.out.println("실행종료");
	}
}



