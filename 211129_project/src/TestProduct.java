
public class TestProduct {

	public static void main(String[] args) {
		Product[] parr = new Product[100];
	
		Product p = new Product("�����","�Ｚ",100);
		int count = 0;
		parr[count++] = p;
		p = new Product("��Ź��","LG",110);
		parr[count++] = p;
		parr[count++] = new Product("��ġ�����","����",120);
		
		System.out.println("���尹��="+count);
		
		for(int i=0; i<count; i++) {
			parr[i].printInfo();
		}
		
		int findIndex = -1;
		String findName = "��ġ�����";
		for(int i=0; i<count; i++) {
			Product pr = parr[i];
			
			if(pr.getName() == findName) {
//				System.out.println("�˻�����");
//				pr.setPrice(130);
				findIndex = i;
				break;
			}
		}
		if(findIndex == -1) {
			System.out.println(findName+"�˻�����");
		}else {
			System.out.println(findName+"�˻�����");
			parr[findIndex].setPrice(130);
		}
		
		for(int i=0; i<count; i++) {
			parr[i].printInfo();
		}
		
		
		findIndex = -1;
		findName = "��Ź��";
		for(int i=0; i<count; i++) {
			Product pr = parr[i];
			
			if(pr.getName() == findName) {
//				System.out.println("�˻�����");
//				pr.setPrice(130);
				findIndex = i;
				break;
			}
		}
		if(findIndex == -1) {
			System.out.println(findName+"�˻�����");
		}else {
			System.out.println(findName+"�˻�����");
			parr[findIndex] = parr[count-1];
			parr[count-1] = null;
			count--;
		}
		
		for(int i=0; i<count; i++) {
			parr[i].printInfo();
		}
	}

}
