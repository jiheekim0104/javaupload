package javaMid10.p464;

public class EceptionEx03 {

	public static void main(String[] args) {
		try {
			Class.forName("java.util.String");
			int a = 10/0;
			int[] number = {10,20,30,40,50};
			System.out.println(number[5]);
			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 없어서 문제여");
			e.printStackTrace();
			
		} catch (ArithmeticException e) {
			System.out.println("나누는게 문제여");
			e.printStackTrace();
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스가 배열의 길이봐 길어서문제여");
			e.printStackTrace();
			
		} finally {
			System.out.println("정상 종료하기");
		}
	
		
		

	}

}
