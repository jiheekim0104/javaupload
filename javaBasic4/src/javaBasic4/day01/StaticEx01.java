package javaBasic4.day01;

public class StaticEx01 {

	public static void main(String[] args) {
		System.out.println("���� ���� �޼ҵ��. Ŭ���� �δ� �ܰ迡�� �ٷ� �޸� ������ �ö�");
		
		StaticEx01 se01 = new StaticEx01(); // �ν��Ͻ� �޼ҵ尡 �޸𸮷� �ö�
		se01.instanceMethod();
	}
	
	public void instanceMethod() {
		System.out.println("���� �ν��Ͻ� �޼ҵ��. ��ü ������ ����Ҽ��־�");
		
	}

}
