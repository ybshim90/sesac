package day01;

import java.util.Scanner;

public class 숫자맞추기 {

	public static void main(String[] args) {
		int ri = (int)(Math.random()*100+1);

//		System.out.println(ri);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1~100사이 숫자를 입력 : ");
			int num = sc.nextInt();
			
			if(ri == num) {
				System.out.println("정답입니다");
				break;
			}else if(ri < num) {
				System.out.println("낮춰주세요");
			}else {
				System.out.println("높여주세요");
			}
		}
		System.out.println("게임 종료");

	}

}
