package javaMid7.p394;

public class OutterA {
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
		//oa +=5;
		soa -=10;
		//oaM();
	}
	/*
	class InnerA { // �̳�Ŭ������ �ٱ����ִ� ��� ���� �� �����ִ�! (����)
		int ia = 20;
		//static int sia = 30;
		void iaM(){
			ia += 10; // �ڱ� ���
			oa += 20; // �ٱ� ���
			soa = soa + 10; // �����ʵ�
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
	
	

