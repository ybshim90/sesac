package project01;
/** ���� */
public class ���� extends ��� {
	
	private String �μ�;

	public ����(String �̸�, String �ֹι�ȣ, String ��ȭ, String �μ�) {
		super(�̸�,�ֹι�ȣ,��ȭ);
		this.�μ� = �μ�;
	}
	
	public ����() {
	}

	public String get�μ�() {
		return �μ�;
	}

	public void set�μ�(String �μ�) {
		this.�μ� = �μ�;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo()+","+�μ�;
	}

}
