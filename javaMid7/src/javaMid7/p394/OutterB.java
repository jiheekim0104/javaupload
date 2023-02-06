package javaMid7.p394;

public class OutterB {
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
		// oa +=5;
		soa -= 10;
		// oaM();
	}

	static class InnerB { // 정적+이너클래스는 바깥에있는 정적변수만 쓸수있다! 자기가 들고있는건 다 ㄱㅊ 
		int ia =20;
		static int sia = 30;

		void iaM(){ ia += 10; // 자기 멤버 //oa += 20; 밖의 인스턴스
			soa = soa + 10; // 정적필드 //oaM(); 밖의 인스턴스 
			soaM(); 
		} 
		static void siaM() {}
	
	}
	
	
	static class InnerBEx {
		void sibM() {
			for(int i=0;i<5;i++) {
				for(int j=0;j<i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}	
		}
	}

	void iaM2() {
			String[] array = {" "," "," "," "," "," "," "};
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < i + 1; j++) {
					array[j] = "*";
					array[6 - j] = "*";
					}
			for (String list :array) {
				System.out.print(list);
			}
			System.out.println();
		}
	}
}
	

