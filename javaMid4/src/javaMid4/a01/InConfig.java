package javaMid4.a01;

public interface InConfig {

	// �߻�޼ҵ�
	void i1();

	// ���
	static final double PI = 3.14;
	static final boolean OK = true;
	static final int COMPUT_PRICE = 2000000;
	static final int PRINT_PRICE = 500000;

	// ����Ʈ�޼ҵ� (���� �ʼ�!) ���� ����Ŭ�������� �������̵� �� �ʿ����
	default void di1() {

	}
	default int di2() {
		return 0;
	}
	
	// �����޼ҵ�
	static void st1() {
		
	}
	private void pr1() {
		//�������̽� �ӿ����� ��밡�� 
	}
	
}
