package day03;
/** �ζǹ�ȣ ���尴ü */
public class LottoNumbers {
	
	int[] nums = new int[6];
	
	/** 6���� �ζǹ�ȣ�� ������ ä��� */

	public void makeNumbers() {
		for(int i=0; i<nums.length; i++) {
			nums[i] = (int)(Math.random()*45+1);
		}
	}

	public void printInfo() {
		for(int n: nums) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	

}
