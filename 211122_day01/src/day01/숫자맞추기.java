package day01;

import java.util.Scanner;

public class ���ڸ��߱� {

	public static void main(String[] args) {
		int ri = (int)(Math.random()*100+1);

//		System.out.println(ri);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1~100���� ���ڸ� �Է� : ");
			int num = sc.nextInt();
			
			if(ri == num) {
				System.out.println("�����Դϴ�");
				break;
			}else if(ri < num) {
				System.out.println("�����ּ���");
			}else {
				System.out.println("�����ּ���");
			}
		}
		System.out.println("���� ����");

	}

}
