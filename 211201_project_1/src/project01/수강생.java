package project01;
/** ������ */
public class ������ extends ��� {

	private String ��������;

	public ������(String �̸�, String �ֹι�ȣ, String ��ȭ, String ��������) {
		super(�̸�, �ֹι�ȣ, ��ȭ);
		this.�������� = ��������;
	}
	
	public ������() {
	}

	public String get��������() {
		return ��������;
	}

	public void set��������(String ��������) {
		this.�������� = ��������;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+","+��������;
	}

}
