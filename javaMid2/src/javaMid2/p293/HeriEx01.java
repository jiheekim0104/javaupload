package javaMid2.p293;

public class HeriEx01 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.setFood("�Դ� ��");
		animal.setSound("������ �Ҹ�");
		animal.printAll(); // ���� �޼ҵ����� ���ΰ��� ���� 
		System.out.println("---------------------");
		
		Dog dog = new Dog();
		dog.setFood("���������");
		dog.setSound("�۸�");
		dog.setCharacteristic("������ �� ������");
		dog.printAll(); // 
		System.out.println("---------------------");
	}

}
