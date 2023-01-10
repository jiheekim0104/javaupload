package javaBasic1;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
			
		
		int a1 =1;
		do { 
			System.out.print(a1);
			a1++;
		} while (a1<=10);
		
		System.out.println(" "); 
		System.out.println("--------------------------"); 
		
		int a2 =100;
		do {
			System.out.print(a2+" ");
			a2-=5;
		} while (a2>=0);
		
		System.out.println(" "); 
		System.out.println("--------------------------"); 
		
		int a3 =1;
		int sum1 = 0;
		do {
			sum1= sum1+a3;
			a3++;
		} while (a3<=100);
		System.out.println(sum1);
		
		System.out.println("--------------------------"); 
		
		int a4 = 2;
		int sum2 = 0;
		do {
			sum2 = sum2 + a4;
			System.out.print(sum2+" ");
			a4+=2;
		} while (a4<=10);
		
		
		System.out.println(" "); 
		System.out.println("--------------------피보나치수열합"); 
		
		int a5 = 1;
		int a6 = 1;
		int sum3 =a5+a6;
		System.out.print(a5+" "+a6+" "+sum3+" ");
		do {
			a5 = a6;
			a6 =sum3;
			sum3 =a5+a6;
			System.out.print(sum3+" ");
		} while(sum3<34);
		
		System.out.println(" "); 
		System.out.println("------------------------"); 
		Scanner sc = new Scanner(System.in);
		String name = null;
		do { 
			System.out.println("이름:");
			name = sc.next();
		} while (!name.equals("y")); //y가 포함되면 종료하게 하는 방법은 없나..?

		sc.close();
		
	}

}
