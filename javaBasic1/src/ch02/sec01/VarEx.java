package ch02.sec01;

public class VarEx {

	public static void main(String[] args) {
		// 변수 value 선언
		int value;
		value = 10;

		// 연산 결과를 변수 result의 초기값으로 대입
		int result = value + 10;

		// 변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);

		int hour = 2;
		int min = 30;
		System.out.println(hour + "시간" + 30 + "분");

		int totalMin = hour * 60 + min;
		System.out.println("총" + totalMin + "분");

		int x = 5;
		int y = 3;
		System.out.println("x:" + x + "y:" + y);

		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + "y:" + y);

		int a = 6;
		int b = 4;
		swap(a, b);
		System.out.println("x:" + a + "y:" + b);

		byte kor = 1; 
		byte kor1 = 89;
		int total = kor + kor1; // 합이 127을 넘어가서가 아니라, 사칙연산의 부호가4바이트 차지함 ㅇㅇ 그러니 결과물도 4바이트로 표현되어해!
		System.out.println(total);
		
		int bkor = 0b1011;
		System.out.println(bkor);
		
		int bkor2= 0b10111;
		System.out.println(bkor2);

	}

	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("x:" + a + "y:" + b);
	}

}
