package javaMid10.p464;

public class EceptionEx02 {

	public static void main(String[] args) {
		int[] number = {10,20,30,40,50};
		try {
			System.out.println(number[5]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("------------------");
			System.err.println(e.toString());
			System.out.println("------------------");
			e.printStackTrace();
			System.out.println("입력한 인덱스가 배열의 길이보다 깁니다.");
		} finally {
			System.out.println("예외랑 상관없이 실행됩니다.");
		}
		
		

	}

}
