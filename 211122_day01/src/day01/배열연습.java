package day01;

public class 배열연습 {

	public static void main(String[] args) {
		int[] scores = new int[3];
		System.out.println(scores);
		System.out.println(scores[0]);
		scores[0] = 90;
		scores[1] = 80;
		scores[2] = 85;
		
		int[] scores2 = {90,80,85};
		System.out.println(scores2[0]);
		System.out.println(scores2[1]);
		System.out.println(scores2[2]);
		
		int[] scores3 = new int[]{90,80,85};

		scores3 = new int[] {50,80,90};
	}
	

}
