package day01;

public class �ζǹ�ȣ�迭 {

	public static void main(String[] args) {
		int[] lottos = new int[6];
		for (int i=1; i<=lottos.length; i++) {
			int r = (int)(Math.random()*45+1);
//			System.out.println(r);
			
			lottos [i-1] = r;
		}
		for (int i=0; i<lottos.length; i++) {
			System.out.println(lottos[i]);
		}
		System.out.println("���̴� "+lottos.length);
		for (int n : lottos) {
			System.out.println("n="+n);
		}
	}
}
