package javaMid7.p419;

public class Car {
	Tire tire = new Tire() {
		
		@Override
		public void roll() {
			System.out.println("�Ϲ� Ÿ�̾ �޸��ϴ�.");
			
		}
	};
	
	Tire tire2 = new Tire() {
		
		@Override
		public void roll() {
			System.out.println("��ȣ Ÿ�̾ �޸��ϴ�.");
			
		}
	};
	
	
	
}
