package day_20211203_01;

public class TestException {

	public static void main(String[] args) {
		try {
			classLoading();
			System.out.println("����");
			classExecute();
			System.out.println("����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void classExecute() {
		
	}

	private static void classLoading() throws ClassNotFoundException {
		
		System.out.println("�ε���");
//		Class.forName("java.lang.String");
		Class.forName("String");
		System.out.println("�ε�����");
		
//		try {
//		} catch (ClassNotFoundException e) {
//			System.out.println("�ε�����");
//		}
	}

}
