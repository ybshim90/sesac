package day01;

public class 조건문 {

	public static void main(String[] args) {
		int a = 101;
		if (a%2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		int score = 92;
		if (score >= 90) {
			System.out.println("A");
		}else if (score >= 80) {
			System.out.println("B");
		}else if (score >= 70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
		int 평점 = 4;
		switch(평점) {
		case 5:
			System.out.println("아주잘함");
			break;
		case 4:
			System.out.println("잘함");
			break;
		case 3:
			System.out.println("보통");
			break;
		}
		
		
	}

}
