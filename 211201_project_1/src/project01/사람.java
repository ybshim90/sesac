package project01;
/** ��� */
public class ��� {
	
	private String �̸�;
	private String �ֹι�ȣ;
	private String ��ȭ;

	public ���(String �̸�, String �ֹι�ȣ, String ��ȭ) {
		this.�̸� = �̸�;
		this.�ֹι�ȣ = �ֹι�ȣ;
		this.��ȭ = ��ȭ;
	}
	
	public ���() {
	}

	public String get�̸�() {
		return �̸�;
	}

	public void set�̸�(String �̸�) {
		this.�̸� = �̸�;
	}

	public String get�ֹι�ȣ() {
		return �ֹι�ȣ;
	}

	public void set�ֹι�ȣ(String �ֹι�ȣ) {
		this.�ֹι�ȣ = �ֹι�ȣ;
	}

	public String get��ȭ() {
		return ��ȭ;
	}

	public void set��ȭ(String ��ȭ) {
		this.��ȭ = ��ȭ;
	}
	
	public String getInfo() {
		return �̸�+","+�ֹι�ȣ+","+��ȭ;
	}
	

}
