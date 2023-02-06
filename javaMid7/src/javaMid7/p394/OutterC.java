package javaMid7.p394;

public class OutterC {
	int ia = 10;
	static int sia = 20;
	
	static void siaM() {}
	void iaM() {
		class InnerC { 
			int ic = 20;
			// static int sic = 20;
			void icM() {
				ia += 100;
				System.out.println("메소드안에 들어있는 클래스의 메소드임");
			}
			
			/*
			static void icsM() {
				System.out.println("메소드안에 들어있는 클래스의 정적 메소드임");
			}
			*/
		}
		InnerC innerC = new InnerC(); //속에서 만들고 객체화하고 여기서 씀
		
	} //iaM end
}
