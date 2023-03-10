package javaBasic1;

import java.util.Scanner;

public class VarEx6 {

	public static void main(String[] args) {
		/* 이름 , 년도 입력 받으면 나이를 출력하는 프로그램 작성 */
		System.out.println("---------------");
		System.out.println("나이 계산 프로그램");
		System.out.println("---------------");

		Scanner sc = new Scanner(System.in);
		System.out.println("이름:");
		String name = sc.next();
		System.out.println(name);
		
		
		System.out.println("출생년도:");
		int year = sc.nextInt();

		int age = 2023 - year;
		System.out.println("나이:" + age);

		/*
		 * if (0<= age && age<=7)
		 * {System.out.println("유아입니다.");System.out.println("유아인 경우는 지원금 100만원을 받으세요.");
		 * } else if (8<= age && age<=13)
		 * {System.out.println("어린이입니다.");System.out.println("어린이인 경우 지원금 50만원을 받으세요.");
		 * } else if (14<= age && age<=19)
		 * {System.out.println("청소년입니다.");System.out.println("청소년인경우 지원금 20만원을 받으세요.");}
		 * else if (20<= age && age<=60)
		 * {System.out.println("어른입니다.");System.out.println("어른인 경우 지원금 20만원을 내세요.");}
		 * else
		 * {System.out.println("노인입니다.");System.out.println("노인인경우 지원금 30만원을 받으세요.");}
		 */

		/*
		 * ageType : 나이별 타입 (유아, 어린이 .... ) subsidy = 100 -20 (받는것은 +값 , 내는것은 -값 )
		 */
		String ageType; // 나이별 타입
		int subsidy; // 지원금

		if (0 <= age && age <= 7) {
			ageType = "유아";
			subsidy = 100;
		} else if (8 <= age && age <= 13) {
			ageType = "어린이";
			subsidy = 50;
		} else if (14 <= age && age <= 19) {
			ageType = "청소년";
			subsidy = 20;
		} else if (20 <= age && age <= 60) {
			ageType = "어른";
			subsidy = 20;
		} else {
			ageType = "노인";
			subsidy = 30;
			;
		}

		/*
		 * if (subsidy < 0) { System.out.println("귀하는" + ageType + "입니다." + "지원금" +
		 * subsidy + "를 내세요."); } else { System.out.println("귀하는" + ageType + "입니다." +
		 * "지원금" + subsidy + "를 받으세요."); }
		 */

		/* 집이 있습니까? 집이 있으면 true 없으면 false , 어른이 집이 있으면 10%더내기 노인이 집에 있으면 10%덜 받기 */

		System.out.println("집이 있습니까?");
		String home = sc.next();

		/*
		 * System.out.println("--------------------"); if ((home.equals("false") &&
		 * ageType.equals("어른"))||(home.equals("false") && ageType.equals("노인"))) {
		 * System.out.println("귀하는" + ageType + "입니다." + "지원금" + Math.abs(subsidy) +
		 * "를 내세요."); // 절대값을 불러내주는 함수얌 ! } else if (home.equals("true") &&
		 * ageType.equals("노인")) { System.out.println("귀하는" + ageType + "입니다." + "지원금" +
		 * Math.abs(subsidy) + "를 내세요.");} else { System.out.println("귀하는" + ageType +
		 * "입니다." + "지원금" + Math.abs(subsidy) + "를 내세요.");
		 * 
		 * }
		 * 
		 * 
		 * if (home.equals("true") && ageType.equals("어른")) {
		 * System.out.println("귀하는 집이 있는 어른입니다." + "지원금" + (int) (subsidy * 1.1) +
		 * "를 내세요."); }
		 * 
		 * if (home.equals("true") && ageType.equals("노인")) {
		 * System.out.println("귀하는 집이 있는 노인입니다." + "지원금" + (int) (subsidy * 0.9) +
		 * "를 내세요."); }
		 */

		if (home.equals("true") && ageType.equals("어른")) {
			System.out.println("귀하는 집이 있는 어른입니다." + "지원금" + (int) (subsidy * 1.1) + "를 내세요.");
		}

		else if (home.equals("false") && ageType.equals("어른")) {
			System.out.println("귀하는" + ageType + "입니다." + "지원금" + subsidy + "를 내세요.");
		}

		else if (home.equals("true") && ageType.equals("노인")) {
			System.out.println("귀하는 집이 있는 노인입니다." + "지원금" + (int) (subsidy * 0.9) + "를 받으세요.");
		}

		else {
			System.out.println("귀하는" + ageType + "입니다." + "지원금" + subsidy + "를 받으세요.");

		}
		sc.close();

	}
}
