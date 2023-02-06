package javaMid7.p413;

public class Car {
	private Tire tire = new Tire();
	
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("필드에서 객체생성된 익명1 굴러갑니다.");
		}
	};
	
	private Tire tire4 = new Tire() {
		@Override
		public void roll() {
			System.out.println("필드에서 객체생성된 익명4 굴러갑니다.");
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
				System.out.println("메소드에서 객체생성된 익명2 굴러갑니다.");
			}
		};
		tire3.roll();
	}
	
	public void run3(Tire tire) {
		tire.roll();
	}
	
	
	
	
	
}
