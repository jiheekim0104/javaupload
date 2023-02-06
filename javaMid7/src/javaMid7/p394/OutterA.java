package javaMid7.p394;

public class OutterA {
	// 컴파일 -> 빌드 -> 실행
	// 클래스로더단계에서 static붙어있는 것은 메모리 올라감
	// 빌드단계에서 new하면 static안붙은 애들이 힙메모리에 올라감
	
	
	int oa = 10;
	static int soa = 20;
	
	void oaM() {
		// 모두다 올라가있기때문에 뭘 쓰던 ㄱㅊㄱㅊ
		oa -= 5;
		soa += 10;
		soaM();
	}
	static void soaM() {
		//oa +=5;
		soa -=10;
		//oaM();
	}
	/*
	class InnerA { // 이너클래스는 바깥에있는 모든 것을 다 쓸수있다! (장점)
		int ia = 20;
		//static int sia = 30;
		void iaM(){
			ia += 10; // 자기 멤버
			oa += 20; // 바깥 멤버
			soa = soa + 10; // 정적필드
			oaM();
			soaM();
		//static void siaM() {}
	*/
	class InnerAEx {
		public int sumCalc() {
			int sum = 0;
			for(int i=1;i<=100;i++) {
				sum+=i;
			}
			return sum;
		}
	}
	
}
	
	

