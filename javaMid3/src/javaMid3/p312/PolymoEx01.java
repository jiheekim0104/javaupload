package javaMid3.p312;

public class PolymoEx01 {
	
	public static void main(String[] args) { // 다형성 Animal animal = new Cat();
		
		//Animal animal = new Animal(); 
		Animal animal = new Cat(); // 작은 타입을 큰타입의 데이터 타입으로 표현되는건 에러없음! 즉 자식클래스가 부모클래스 테이터 타입으로 표현되는건 문제 없음.
		Cat cat = new Cat();
		// Cat cat = (Cat)animal; 
		boolean result1 = cat instanceof Animal;
		boolean result2 = animal instanceof Cat; // 자식 클래스가 부모클래스의 데이터타입으로 생성자 선언되지않으면 여기는 false임!
		boolean result3 = animal instanceof Animal;
		boolean result4 = cat instanceof Cat;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}
	
	
	
}
