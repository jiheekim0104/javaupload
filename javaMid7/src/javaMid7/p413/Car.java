package javaMid7.p413;

public class Car {
	private Tire tire = new Tire();
	
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("�ʵ忡�� ��ü������ �͸�1 �������ϴ�.");
		}
	};
	
	private Tire tire4 = new Tire() {
		@Override
		public void roll() {
			System.out.println("�ʵ忡�� ��ü������ �͸�4 �������ϴ�.");
		}
	};
	
	public void run1() {
		tire.roll();
		tire2.roll();
		tire4.roll();
	}
	
	public void run2() {
		Tire tire3 = new Tire() {
			@Override
			public void roll() {
				System.out.println("�޼ҵ忡�� ��ü������ �͸�2 �������ϴ�.");
			}
		};
		tire3.roll();
	}
	
	public void run3(Tire tire) {
		tire.roll();
	}
	
	
	
	
	
}
