package day04;

public class TestProduct {

	public static void main(String[] args) {
		Product[] products = new Product[100];
		//�ʱ⼳��
		int count = 0;
		
		products[count++] = new Product("�����",100,"�Ｚ");
		products[count++] = new Product("��Ź��",100,"LG");
		products[count++] = new Product("��ġ�����",100,"����");
		
		System.out.println("�ʱⰪ");
		
		for(int i=0;i<count;i++) {
			products[i].printInfo();
		}
		
		//����
		String pName = "��ġ�����";
		int findIndex = -1;
		
		for(int i=0;i<count;i++) {
			Product p = products[i];
			
			if(p.getName() == pName) {
				findIndex = i;
				break;
			}
		}
		
		if(findIndex == -1) {
			System.out.println("�˻�����");
		}else {
			products[findIndex].setPrice(150);
		}
		
		System.out.println("����");
		
		for(int i=0;i<count;i++) {
			products[i].printInfo();
		}
		
		//����
		pName = "��Ź��";
		findIndex = -1;
		
		for(int i=0;i<count;i++) {
			Product p = products[i];
			
			if(p.getName() == pName) {
				findIndex = i;
				break;
			}
		}
		
		if(findIndex == -1) {
			System.out.println("�˻�����");
		}else {
			products[findIndex] = products[count-1];
			products[count-1] = null;
			count--;
		}
		
		System.out.println("����");
		
		for(int i=0;i<count;i++) {
			products[i].printInfo();
		}
		
		
	}

}
