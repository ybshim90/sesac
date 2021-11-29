package day04;

public class TestMovie {

	public static void main(String[] args) {
		
		Movie m1 = new Movie("½Å¼¼°è","È«±æµ¿",10000);
		Movie m2 = new Movie("º£Å×¶û","±è±æµ¿",15000);
		
		m1.printInfo();
		m2.printInfo();
		
		System.out.println(m1.getTitle()+" "+m1.getDirect());
		System.out.println(m2.getTitle()+" "+m2.getDirect());
		
	}

}
