package javaMid7.p394;

public class OutterD {
	static int sia = 200;
	
	static void sM() {
		final int ss = 10;
		class InnerD{
			int sid =20;
			void siM() {
				System.out.println("InnewrD�� Ŭ���� siM()�κ���"+sid+" "+ sia);
			}
		}
		 InnerD innerD = new InnerD();
		 innerD.siM();
		
	}
}
