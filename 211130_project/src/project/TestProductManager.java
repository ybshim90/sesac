package project;

import java.util.Scanner;

public class TestProductManager {

	static Scanner sc = new Scanner(System.in);
	
	static Product[] parr = new Product[2000];
	static int count = 0;
	
	public static void main(String[] args) {
		while(true) {
			printMainMenu();
			int menuNo = Integer.parseInt(sc.nextLine());;
			if(menuNo == 99) {
				break;
			}
			if(menuNo == 1) {
				registProduct();
			}else if(menuNo == 2) {
				printAll();
			}
		}
		System.out.println("����");
		
	}

	private static void printAll() {
		System.out.println("��ü���");
		System.out.println("��ǰ��ȣ-��ǰ�̸�-������-����-����");
		for(int i=0; i<count; i++) {
			parr[i].printInfo();
		}
	}

	private static void registProduct() {
		System.out.println("��ǰ��ȣ�Է�:");
		int no = Integer.parseInt(sc.nextLine());
		System.out.println("��ǰ�̸��Է�:");
		String name = sc.nextLine();
		System.out.println("��ǰ�������Է�:");
		String factory = sc.nextLine();
		System.out.println("��ǰ�����Է�:");
		int price = Integer.parseInt(sc.nextLine());
		System.out.println("��ǰ�����Է�:");
		int qnt = Integer.parseInt(sc.nextLine());
		
		Product p = new Product(no,name,factory,price,qnt);
		parr[count++] = p;
	}
	

	private static void printMainMenu() {
		System.out.println("(1)��ǰ��� (2)��ǰ��� (3)��ǰ�˻�-��,����,���� (99)����");
		System.out.println("��ȣ�Է�:");
		
	}

}
