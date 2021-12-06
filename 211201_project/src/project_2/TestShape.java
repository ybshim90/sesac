package project_2;

public class TestShape {

	public static void main(String[] args) {
		Line l1 = new Line("black",3,3,9,9);
		System.out.println(l1.getInfo());
		
		Circle c1 = new Circle("blue",3,4,12);
		System.out.println(c1.getInfo());
		
		Shape s1 = l1;
		System.out.println(s1.getInfo());
		
		Rect r1 = new Rect("blue",30,40,20,20);
		
		Shape[] sarr = new Shape[1000];
		sarr[0] = l1;
		sarr[1] = c1;
		sarr[2] = r1;
		
		System.out.println("전체출력");
		for(int i=0; i<3; i++) {
//			System.out.println(sarr[i].getInfo());
			sarr[i].draw();
		}
		
//		Shape ss1 = new Shape("black,3,3");
		
	}

}
