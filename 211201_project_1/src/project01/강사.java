package project01;
/** ���� */
public class ���� extends ��� {

	private String ���ǰ���;

	public ����(String �̸�, String �ֹι�ȣ, String ��ȭ, String ���ǰ���) {
		super(�̸�,�ֹι�ȣ,��ȭ);
		this.���ǰ��� = ���ǰ���;
	}
	
	public ����() {
	}

	public String get���ǰ���() {
		return ���ǰ���;
	}

	public void set���ǰ���(String ���ǰ���) {
		this.���ǰ��� = ���ǰ���;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+","+���ǰ���;
	}
}
