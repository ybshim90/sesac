package project_01;

public class TestException2 {

	public static void main(String[] args) {
		try {			
			a();
			System.out.println("����");
		}catch (Exception e) {
			System.out.println("����");
		}
	}

	private static void a() throws ClassNotFoundException{
//		try {
		Class.forName("project_01.Member");
		System.out.println("����");
//		}catch(Exception e){
//			System.out.println("����");
//		}
		System.out.println("�Ϸ�");
	}

}
