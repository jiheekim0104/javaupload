package Ex;

public class A extends BB {
	//1 ~ 10���� ��
	int result1=0 ;
	int result2=0;

	@Override
	public int add(int number) {
		for (int i =1;i<=number;i++) {
			result1 += i;
		}
		return result1;
	}
		
	//�� - 10
	@Override
	public int subtract (int result1,int number) {
		result2 = result1 - number;
		return result2;
	}
	
}

