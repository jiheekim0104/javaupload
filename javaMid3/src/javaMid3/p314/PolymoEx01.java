package javaMid3.p314;

public class PolymoEx01 {
	public static void main(String[] args) {
		Car car = new Car();
		car.tire = new Tire(); 
		car.run();
		
		car.tire = new HankookTire(); //부모변수안에 자식 객제 주소를 넣는다 ==> 다형성!
		car.run();
		
		car.tire = new KumhoTire();
		car.run();
		
	}
	
	
}
