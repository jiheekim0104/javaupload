package javaMid3.p312;

public class PolymoEx01 {
	
	public static void main(String[] args) { // ������ Animal animal = new Cat();
		
		//Animal animal = new Animal(); 
		Animal animal = new Cat(); // ���� Ÿ���� ūŸ���� ������ Ÿ������ ǥ���Ǵ°� ��������! �� �ڽ�Ŭ������ �θ�Ŭ���� ������ Ÿ������ ǥ���Ǵ°� ���� ����.
		Cat cat = new Cat();
		// Cat cat = (Cat)animal; 
		boolean result1 = cat instanceof Animal;
		boolean result2 = animal instanceof Cat; // �ڽ� Ŭ������ �θ�Ŭ������ ������Ÿ������ ������ ������������� ����� false��!
		boolean result3 = animal instanceof Animal;
		boolean result4 = cat instanceof Cat;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}
	
	
	
}
