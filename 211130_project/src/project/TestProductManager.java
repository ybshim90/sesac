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
		System.out.println("종료");
		
	}

	private static void printAll() {
		System.out.println("전체출력");
		System.out.println("상품번호-상품이름-제조사-가격-수량");
		for(int i=0; i<count; i++) {
			parr[i].printInfo();
		}
	}

	private static void registProduct() {
		System.out.println("상품번호입력:");
		int no = Integer.parseInt(sc.nextLine());
		System.out.println("상품이름입력:");
		String name = sc.nextLine();
		System.out.println("상품제조사입력:");
		String factory = sc.nextLine();
		System.out.println("상품가격입력:");
		int price = Integer.parseInt(sc.nextLine());
		System.out.println("상품수량입력:");
		int qnt = Integer.parseInt(sc.nextLine());
		
		Product p = new Product(no,name,factory,price,qnt);
		parr[count++] = p;
	}
	

	private static void printMainMenu() {
		System.out.println("(1)상품등록 (2)상품목록 (3)상품검색-상세,수정,삭제 (99)종료");
		System.out.println("번호입력:");
		
	}

}
