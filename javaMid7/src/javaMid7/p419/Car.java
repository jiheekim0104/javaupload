package javaMid7.p419;

public class Car {
	Tire tire = new Tire() {
		
		@Override
		public void roll() {
			System.out.println("일반 타이어가 달립니다.");
			
		}
	};
	
	Tire tire2 = new Tire() {
		
		@Override
		public void roll() {
			System.out.println("금호 타이어가 달립니다.");
			
		}
	};
	
	
	
}
