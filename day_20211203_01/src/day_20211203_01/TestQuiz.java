package day_20211203_01;

import java.util.ArrayList;
import java.util.Scanner;

public class TestQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //��ĳ�ʻ���
		
		ArrayList<Integer> intList = new ArrayList<Integer>(); //List����
		
		int num = 0; //�Է°�
		int sum = 0; //�հ�
		
		System.out.println("���ڸ� �Է��ϼ��� -999 �Է� �� �հ����");
		
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
		System.out.println("�հ�:"+sum);
	}

}
