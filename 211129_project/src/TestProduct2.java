
public class TestProduct2 {
	
	public static void main(String[] args) {
		ProductManager pm = new ProductManager();
		
		Product p = new Product("냉장고","삼성",100);
		pm.add(p);
		p = new Product("세탁기","LG",110);
		pm.add(p);
		p = new Product("김치냉장고","만도",120);
		pm.add(p);
		
		System.out.println("count:"+pm.getCount());
		
		System.out.println("전체출력");
		pm.printAll();
		
		
		int findIndex = pm.findByName("세탁기");
		if(findIndex == -1) {
			System.out.println("검색실패");
		}else {
			System.out.println("검색성공");
		}
	}
}
