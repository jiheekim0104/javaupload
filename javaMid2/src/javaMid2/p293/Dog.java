package javaMid2.p293;

public class Dog extends Animal {
	private String characteristic;

	public String getCharacteristic() {
		return characteristic;
	}

	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}
	
	@Override //'�Ʒ��� �ִ� �޼ҵ�� �����̸��� ���� �޼ҵ�� �θ����׵� �ֽ��ϴ�.��� ��!' �ٷ� �ؿ��ִ°Ÿ�!!
	public void printAll() { // �θ��� �޼ҵ��� ���� �޼ҵ�� �������̵��Ҷ��� ���� ���� ���ƾ��Ѵ�.
		System.out.println("������? "+ getFood());
		System.out.println("�Ҹ���? "+ getSound());
		System.out.println("Ư¡��? "+ getCharacteristic());
	}
	
	@Override 
	public void ppAA() {// �θ� �޼ҵ尡 final�̸� �������̵� �Ұ�
		
	}
}
