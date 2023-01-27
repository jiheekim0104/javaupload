package javaMid2.p293;

public class Dog extends Animal {
	private String characteristic;

	public String getCharacteristic() {
		return characteristic;
	}

	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}
	
	@Override //'아래에 있는 메소드와 같은이름을 갖는 메소드는 부모한테도 있습니다.라는 뜻!' 바로 밑에있는거만!!
	public void printAll() { // 부모의 메소드명과 같은 메소드로 오버라이딩할때는 리턴 값도 같아야한다.
		System.out.println("음식은? "+ getFood());
		System.out.println("소리는? "+ getSound());
		System.out.println("특징는? "+ getCharacteristic());
	}
	
	@Override 
	public void ppAA() {// 부모 메소드가 final이면 오버라이딩 불가
		
	}
}
