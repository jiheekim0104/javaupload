package javaMid7.p394;

public class OutterB {
	// ������ -> ���� -> ����
	// Ŭ�����δ��ܰ迡�� static�پ��ִ� ���� �޸� �ö�
	// ����ܰ迡�� new�ϸ� static�Ⱥ��� �ֵ��� ���޸𸮿� �ö�

	int oa = 10;
	static int soa = 20;

	void oaM() {
		// ��δ� �ö��ֱ⶧���� �� ���� ��������
		oa -= 5;
		soa += 10;
		soaM();
	}

	static void soaM() {
		// oa +=5;
		soa -= 10;
		// oaM();
	}

	static class InnerB { // ����+�̳�Ŭ������ �ٱ����ִ� ���������� �����ִ�! �ڱⰡ ����ִ°� �� ���� 
		int ia =20;
		static int sia = 30;

		void iaM(){ ia += 10; // �ڱ� ��� //oa += 20; ���� �ν��Ͻ�
			soa = soa + 10; // �����ʵ� //oaM(); ���� �ν��Ͻ� 
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
	

