package ch02.sec01;

import java.util.Scanner;

public class VarEx2 {

	public static void main(String[] args) {
		char aWord = 'a';
		System.out.println(aWord + 1);
		System.out.println(aWord - 32);
		System.out.println((char) (aWord - 32));

		char kWord = 'K';
		System.out.println(kWord);
		System.out.println((char) (kWord + 40));

		char firname = '김'; // 한글자씩 처리!
		char midname = '지';
		char laname = '희';
		System.out.println((int) (firname) + " " + (int) (midname) + " " + (int) (laname));

		String name = "김지희"; // 여러문자열 처리!

		String hakbun = "221208";
		int hakbun1 = 221208; // 정수로 표현하기위해 다른 변수를 추가로 사용함!
		System.out.println("다음 사람의 학번:" + (hakbun1 + 1));

		String hakbun2 = "221208";
		int num = Integer.parseInt(hakbun2); // string을 int로 바꿔줌! 근데여기서도 추가 변수 씀.
		System.out.println(num);

		System.out.println(Integer.valueOf(hakbun2)); // 이렇게하면 추가 변수가 필요없음!

		String avgV = "52.3";
		double avgV1 = 52.3;
		System.out.println((double) (avgV1 + 100));

		String 성별 = "true";
		boolean 변환 = Boolean.parseBoolean(성별);
		System.out.println(성별);
		if (변환)
			System.out.println("남자");
		else
			System.out.println("여자");

		byte v1 = 10;
		int v2 = 20;
		v2 = v1; // 뒤에있는게 앞으로 들어감! byte -> int 자동 타입 변환이 일어남
		v1 = (byte) v2; // int -> byte 오류 발생

		int v3 = 50;
		double v4 = 10.0;
		float v5 = 20.5f;

		v4 = v3;
		v4 = v5;
		v3 = (int) v4;
		v3 = (int) v5;
		v5 = (float) v4;

		Scanner sc = new Scanner(System.in); // 키보드 입력을 담당하는 Scanner 클래스를 사용한다!

		int x = sc.nextInt();// 키보드에서 정수를 입력받는다 이렇게 생긴건 ()안이 비어도 사용가능한 함수란 소리야~
		System.out.println("입력값" + x);

		int y = sc.nextInt();
		System.out.println("입력값" + y);

		double aa = sc.nextDouble();
		System.out.println("실수입력값" + aa);

		double bb = sc.nextDouble();
		System.out.println("실수입력값" + bb);
		

		boolean b1 = sc.nextBoolean(); // 왜안되는지 이유 찾아볼것 ㅇㅅㅇ 
		System.out.println("블린형1:" + b1);
		
		boolean b2 = sc.nextBoolean();
		System.out.println("블린형2:" + b2);

		String s1 = sc.next();
		System.out.println("문자형1:"+s1);
		
		String s2 = sc.next();
		System.out.println("문자형2:"+ s2);

	}

}
