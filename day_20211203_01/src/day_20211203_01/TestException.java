package day_20211203_01;

public class TestException {

	public static void main(String[] args) {
		try {
			classLoading();
			System.out.println("성공");
			classExecute();
			System.out.println("종료");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void classExecute() {
		
	}

	private static void classLoading() throws ClassNotFoundException {
		
		System.out.println("로딩전");
//		Class.forName("java.lang.String");
		Class.forName("String");
		System.out.println("로딩성공");
		
//		try {
//		} catch (ClassNotFoundException e) {
//			System.out.println("로딩실패");
//		}
	}

}
