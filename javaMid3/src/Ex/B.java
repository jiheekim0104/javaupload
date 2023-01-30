package Ex;

public class B extends BB{
	int result1 =0;
	
	@Override
	public int add(int number) {
		for (number =0;number<=100;number++) {
			result1 +=number;
		}
		return result1;
	}
}
