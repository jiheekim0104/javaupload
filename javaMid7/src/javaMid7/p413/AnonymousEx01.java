package javaMid7.p413;

public class AnonymousEx01 {

	public static void main(String[] args) {
		Car car = new Car();
		car.run1();
		car.run2();
		
		car.run3(new Tire() {
			
			@Override
			public void roll() {
				System.out.println("매개변수로 객체생성된 익명3 굴러갑니다.");
			}
		});
		
		

	}

}
