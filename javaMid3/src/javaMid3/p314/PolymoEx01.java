package javaMid3.p314;

public class PolymoEx01 {
	public static void main(String[] args) {
		Car car = new Car();
		car.tire = new Tire(); 
		car.run();
		
		car.tire = new HankookTire(); //�θ𺯼��ȿ� �ڽ� ���� �ּҸ� �ִ´� ==> ������!
		car.run();
		
		car.tire = new KumhoTire();
		car.run();
		
	}
	
	
}
