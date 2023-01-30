package Ex;

public class C extends BB{
	int result1=0;
	int result3=1;
	
	@Override
	public int add(int number) {
		for (number =0;number<=200;number++) {
			result1 +=number;
		}
		return result1;
	}
	
	int result2 = subtract(result1, 200);
	
	public int multiplication(int number) {
		for (number =1;number<=20;number++) {
			result3 *=number;
		}
		return result3;
	}
}
