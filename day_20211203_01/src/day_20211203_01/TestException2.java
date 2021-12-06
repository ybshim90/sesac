package day_20211203_01;

public class TestException2 {

	public static void main(String[] args) {
		try {
			String s = "a";
			System.out.println(s.length());
			int[] arr = new int[100];
			arr[100] = 100;
			System.out.println("종료");
		} catch (NullPointerException e) {
			System.out.println("null 예외발생");
		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println("index 예외발생");
		} catch (Exception e) {
			System.out.println("예외발생");
		}
	}

}
