package day_20211203_01;

import java.util.ArrayList;
import java.util.Scanner;

public class TestQuiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //��ĳ�ʻ���
		
		ArrayList<String> list = new ArrayList<String>(); //List����
		
		int count = 0; //�达
		
		System.out.println("�̸��� �Է��ϼ���. �� �Է� �� ����");
		
		while(true) {
			String member = sc.nextLine();
			if(member.equals("��")) {
				break;
			}
			list.add(member);				
		}
		
		
		System.out.println("�� ȸ����:"+list.size()+"��");
		for(String s : list) {
			if(s.charAt(0) == '��'){
				count++;
			}
		}
		System.out.println("�达 ȸ����:"+count+"��");
	}

}
