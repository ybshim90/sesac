package day_20211203_01;

import java.util.ArrayList;
import java.util.Scanner;

public class TestQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //스캐너생성
		
		ArrayList<Integer> intList = new ArrayList<Integer>(); //List생성
		
		int num = 0; //입력값
		int sum = 0; //합계
		
		System.out.println("숫자를 입력하세요 -999 입력 시 합계출력");
		
		while(true) {
			num = Integer.parseInt(sc.nextLine());
			if(num != -999) {
				break;
			}
			intList.add(num);				
		}
		
		for(int i : intList) {
			sum += i;
		}
		System.out.println("합계:"+sum);
	}

}
