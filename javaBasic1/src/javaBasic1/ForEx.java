package javaBasic1;

import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println("--------------------------");

		for (int i1 = 10; i1 <= 100; i1 += 10) {
			System.out.print(i1 + " ");
		}

		System.out.println();
		System.out.println("--------------------------");

		int sum1 = 0;
		for (int i2 = 1; i2 <= 100; i2++) {
			sum1 = sum1 + i2;
		}
		System.out.println(sum1);

		System.out.println();
		System.out.println("--------------------------");

		int sum2 = 0;
		int counter = 0;
		for (int i3 = 1; i3 <= 100; i3 += 2) {
			sum2 = sum2 + i3;
			counter++;
		}
		System.out.println(sum2 + "," + counter);

		System.out.println();
		System.out.println("--------------------------");

		for (int i4 = 1; i4 <= 100; i4++) {
			System.out.print(i4 + " ");
			if (i4 % 10 == 0) {
				System.out.println();
			}
		}
		
		/* 10개씩 세어서 줄바꿈 해주는 방법
		int cnt =0;
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
			if (cnt == 10) {
				System.out.println();
				cnt = 0;
			}
		}
		 */ 

		System.out.println();
		System.out.println("--------------------------"); 
		System.out.println("결과화면");
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. (예:12345) ==>");
		String number = sc.nextLine(); 
		int sum = 0;
		while (number.length() > 0) {
			sum += Integer.parseInt(number.substring(number.length() - 1));
			System.out.println("sum = " + sum + " number = " + number);
			number = number.substring(0, number.length() - 1);
		}
		System.out.println("각 자리수의 합:"+sum);
		
		/*
		System.out.println("결과화면");
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요. (예:12345) ==>");
		int number = sc.nextInt();
		int number1 = 0;
		int temp = 0;
		int s = 0;
		while(number>=1){
			number1 = number / 10;
			temp = number1*10;
			s = s+ (number-temp);
			System.out.println("sum ="+ s+" "+"number ="+number)
			number=number1;
		 */
		
		System.out.println();
		System.out.println("--------------------------");

		System.out.println("숫자를 입력:");
		int number1 = 0;
		int sum3 = 0;
		do {
			number1 = sc.nextInt();
			sum3 = sum3 + number1;
		} while (number1 != 0);
			System.out.println(sum3);

		sc.close();

	}

}
