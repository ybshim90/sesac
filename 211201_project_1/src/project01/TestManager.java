package project01;

public class TestManager {

	public static void main(String[] args) {
		
		���[] parr = new ���[1000];
		int count = 0;
		parr[count++] = new ����("ȫ�浿","111-222","010-111","�ѹ���");
		parr[count++] = new ����("��浿","111-333","010-222","������");
		parr[count++] = new ����("�ڱ浿","111-444","010-223","�ڹ�");
		parr[count++] = new ����("�̱浿","111-555","010-332","���̽�");
		parr[count++] = new ������("�ֱ浿","111-666","010-443","�ڹٱ⺻");
		parr[count++] = new ������("���浿","111-777","010-553","���̽��߱�");
		
		System.out.println("��ü���");
		for(int i=0; i<count; i++) {
			System.out.println(parr[i].getInfo());
		}
	}

}
