package javaBasic1;

import java.util.Scanner;

public class OperandEx01 {

	public static void main(String[] args) {
		// 연산자
		int a = 10;
		System.out.println(a + 1);

		System.out.println(--a);

		int b = 11;
		System.out.println("b:" + b);

		int d = 20;
		System.out.println(d++);
		System.out.println(++d);

		int e = 0;
		System.out.println(e++ + ++e);

		double a1 = 25;
		double a2 = 4;
		double r1 = a1 / a2;
		System.out.println(r1);

		int v5 = 0b01011;
		int v6 = 0b10111;
		System.out.println(Integer.toBinaryString(v5 & v6));
		System.out.println(Integer.toBinaryString(v5 | v6));
		System.out.println(Integer.toBinaryString(v5 ^ v6));

		int v9 = 10;
		System.out.println((v9 == 9) ? "합격" : "불합격");

		String type = "A";
		System.out.println((type.equals("A") ? "VIP고객입니다" : "일반고객입니다"));

		int c1 =50;
		System.out.println((c1>=25)?"포인트대상":"포인트미대상");
		
		String d1 = "자바";
		System.out.println((d1.equals("자바")?"A교실입니다.":"B,C교실입니다."));		
		
		Scanner sc = new Scanner(System.in);
		/*System.out.println("숫자1 입력:");
		int e1 = sc.nextInt();
		System.out.println("숫자2 입력:");
		int e2 = sc.nextInt();
        System.out.println((e1>e2)?e1:e2);	*/	
        
        // 3개 비교해보기!
       /*  System.out.println("--------주말숙제!---------");	
        System.out.println("숫자1 입력:");
        int e3 = sc.nextInt();
        System.out.println("숫자2 입력:");
        int e4 = sc.nextInt();
        System.out.println("숫자3 입력:");
        int e5 = sc.nextInt();	
        System.out.println((e3>=e4)?((e3>=e4)?e3:e4):((e4>=e5)?e4:e5)); */
        
        /* 
          int maxNumber = (e3>=e4)?e3:e4;
          maxNumber = (maxnNumber>=e5)?maxnumber:e5; */
        
        // 숫자 3개를 입력받고 중간 숫자를 출력하기
        /* System.out.println("숫자1 입력:");
        int e6 = sc.nextInt();
        System.out.println("숫자2 입력:");
        int e7 = sc.nextInt();
        System.out.println("숫자3 입력:");
        int e8 = sc.nextInt();	
        System.out.println((e6>=e7)?((e6>=e8)?((e7>=e8)?e7:e8):e6):((e6>=e8)?e6:((e7>=e8)?e8:e7))); */
        
		/*
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int number1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int number2 = sc.nextInt();
		System.out.print("세번째 숫자를 입력하세요 : ");
		int number3 = sc.nextInt();

		int result1 = (number1 <= number2) ? number1 : number2;
		int min = (result1 <= number3) ? result1 : number3;
		
		int result2 = (number1 >= number2) ? number1 : number2;
		int max = (result2 >= number3) ? result2 : number3;
		int mid = (number1 != min && number1 != max) ? number1 : ((number2 != min && number2 != max) ? number2 : number3);
		
		System.out.println(mid);

		 */
        
        Scanner Scr = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력==>");
		int number6=Scr.nextInt();
		System.out.print("두번째 숫자를 입력==>");
		int number7=Scr.nextInt();
		System.out.print("세번째 숫자를 입력==>");
		int number8=Scr.nextInt();
		
		int middleNumber = (number6>=number7)? number6:number7;
		middleNumber = (number8>=middleNumber)? ((number7>number8)?number8:number7):number7;
		System.out.println(middleNumber);

        
        

        
	}

}
