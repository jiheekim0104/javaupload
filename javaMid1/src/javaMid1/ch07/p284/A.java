package javaMid1.ch07.p284;

public class A extends P {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printM() {
		System.out.println("�̸��� "+ name);
		System.out.println("��ȭ��ȣ�� "+ getPhone()); 
		
	}
	
}
