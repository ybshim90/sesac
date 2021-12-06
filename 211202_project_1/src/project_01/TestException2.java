package project_01;

public class TestException2 {

	public static void main(String[] args) {
		try {			
			a();
			System.out.println("성공");
		}catch (Exception e) {
			System.out.println("실패");
		}
	}

	private static void a() throws ClassNotFoundException{
//		try {
		Class.forName("project_01.Member");
		System.out.println("성공");
//		}catch(Exception e){
//			System.out.println("실패");
//		}
		System.out.println("완료");
	}

}
