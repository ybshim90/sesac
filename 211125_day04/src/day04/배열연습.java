package day04;

public class 배열연습 {

	public static void main(String[] args) {
//		int score1 = 90;
//		int[] scores = new int[100];
//		String name = "홍길동";
//		String[] names = new String[100];
		
		int[] scores = new int[3];
		
		int[][] scores2 = new int[2][3];
		
		int[] scores3 = {70,90,80};
		
		System.out.println(scores3[0]+","+scores3[1]+","+scores3[2]);
		
		int[] scores4 = new int[3];
		scores4[0] = 70;
		scores4[1] = 90;
		scores4[2] = 80;
		
		int[][] scores5 = {{1,3,5},{2,4,6}};
		
		// 일기저장하기
		String[] diary = new String[400];
		// 1월1일
		int month = 1;
		int day = 1;
		diary[ (month-1)*31 + (day-1) ] = "오늘은 1월1일.";
		
		month = 12;
		day = 31;
		diary[ (month-1)*31 + (day-1) ] = "오늘은 12월31일.";

		String[][] diary2 = new String[12][31];
		diary2[0][0] = "오늘은 1월1일.";
		diary2[10][24] = "오늘은 11월25일.";
		
	}

}
