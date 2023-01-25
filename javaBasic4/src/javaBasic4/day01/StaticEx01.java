package javaBasic4.day01;

public class StaticEx01 {

	public static void main(String[] args) {
		System.out.println("나는 정적 메소드야. 클래스 로더 단계에서 바로 메모리 영역에 올라감");
		
		StaticEx01 se01 = new StaticEx01(); // 인스턴스 메소드가 메모리로 올라감
		se01.instanceMethod();
	}
	
	public void instanceMethod() {
		System.out.println("나는 인스턴스 메소드야. 객체 생성후 사용할수있어");
		
	}

}
