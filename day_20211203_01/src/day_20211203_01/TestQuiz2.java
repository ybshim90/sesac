package day_20211203_01;

import java.util.ArrayList;
import java.util.Scanner;

public class TestQuiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //스캐너생성
		
		ArrayList<String> list = new ArrayList<String>(); //List생성
		
		int count = 0; //김씨
		
		System.out.println("이름을 입력하세요. 끝 입력 시 종료");
		
		while(true) {
			String member = sc.nextLine();
			if(member.equals("끝")) {
				break;
			}
			list.add(member);				
		}
		
		
		System.out.println("총 회원수:"+list.size()+"명");
		for(String s : list) {
			if(s.charAt(0) == '김'){
				count++;
			}
		}
		System.out.println("김씨 회원수:"+count+"명");
	}

}
