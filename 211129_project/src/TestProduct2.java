
public class TestProduct2 {
	
	public static void main(String[] args) {
		ProductManager pm = new ProductManager();
		
		Product p = new Product("�����","�Ｚ",100);
		pm.add(p);
		p = new Product("��Ź��","LG",110);
		pm.add(p);
		p = new Product("��ġ�����","����",120);
		pm.add(p);
		
		System.out.println("count:"+pm.getCount());
		
		System.out.println("��ü���");
		pm.printAll();
		
		
		int findIndex = pm.findByName("��Ź��");
		if(findIndex == -1) {
			System.out.println("�˻�����");
		}else {
			System.out.println("�˻�����");
		}
	}
}
