
public class ProductManager {
	private Product[] parr = new Product[100];
	private int count = 0;
	
	
	
	public void add(Product p) {
		parr[count++] = p;
	}
	
	public int getCount() {
		return count;
	}

	public int findByName(String name) {
		for(int i=0; i<count; i++) {
			if(parr[i].getName() == name) {
				return i;
			}
		}
		return -1;
	}

	public void printAll() {
		for(int i=0; i<count; i++) {
			parr[i].printInfo();
		}
	}
}
