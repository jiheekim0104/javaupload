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
				System.out.println("�޼ҵ�ȿ� ����ִ� Ŭ������ �޼ҵ���");
			}
			
			/*
			static void icsM() {
				System.out.println("�޼ҵ�ȿ� ����ִ� Ŭ������ ���� �޼ҵ���");
			}
			*/
		}
		InnerC innerC = new InnerC(); //�ӿ��� ����� ��üȭ�ϰ� ���⼭ ��
		
	} //iaM end
}
