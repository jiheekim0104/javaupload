package javaBasic1;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		/*
		for (int j=1;j<=10;j++) {
			for(int i=1;i<=100;i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------");
		
		for (int b=1;b<5;b++) {
			for (int a=1;a<=20;a++) {
				System.out.print("홍길동 ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------");
		
		int i=0;
		int sum =0;
		for (i=1;i<=50;i++) {
			System.out.print(i+" ");
			sum = sum + i;
			if(sum>500) break;
		}
		System.out.println();
		System.out.println(sum);
		System.out.println(i);
		*/
		for (int i=1;i<=100;i++) {
			System.out.print(i+" ");
			if(i==55) break;
		}
		
		System.out.println("-----------------------------");
		
		int cnt = 0;
		int a =0;
		for (a=10;a<=1000;a+=10) {
			System.out.print(a+" ");
			cnt++;
			if(cnt==20) break;
		}
		System.out.println("20번째 숫자:"+a);
		
		System.out.println("-----------------------------");
		Scanner sc = new Scanner(System.in);
		int input=0;
		while(true) {
			System.out.print("숫자 입력:");
			input=sc.nextInt();
			sc.nextLine(); 
			if(input==0) break;
		}
		
		System.out.println("-----------------------------");
		String text =null;
		do {
			System.out.print("문자 입력:");
			text = sc.nextLine();
			text = text.toUpperCase();
		} while(!text.equals("NO"));
		
		System.out.println("-----------------------------");
		
		sc.close();
	}

}
