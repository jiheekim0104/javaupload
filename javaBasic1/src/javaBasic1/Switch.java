package javaBasic1;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int a = 10;
		switch(a) {
			case 1: System.out.println("case1");
				break;
			case 5: System.out.println("case5");
				break;
			case 10: System.out.println("case10");
				break;
			default : System.out.println("default");
			}

		System.out.println("-------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("이름:");
		String name = sc.nextLine();
		switch (name) {
			case "홍길동" : System.out.println("산에 삽니다");
				break;
			case "이순신" : System.out.println("바다에 삽니다");
				break;
			case "강감찬" : System.out.println("평지에 삽니다");
				break;
			default : System.out.println("집에 삽니다");
		}
		
		System.out.println("-------------------------");
		int number=0;
		int sum =0;
		int cnt =0;
		for(int i=1;i<=3;i++) {
		System.out.print("점수"+i+":");
		number = sc.nextInt();
		sum =sum + number;
		cnt++;
		}
		double avg = (double)sum/cnt;
		System.out.print("평균:"+avg);
		switch ((int)avg/10) {
			case 10 : //case만 잡아주고 아래 내용이 실행되게함..!
			case 9 :System.out.print(" A학점");
				break;
			case 8 :System.out.print(" B학점");
				break;
			case 7 :System.out.print(" C학점");
				break;
			case 6 :System.out.print(" D학점");
				break;
			default :System.out.print(" F학점");
		}
		
		System.out.println("-------------------------");
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		}

}
