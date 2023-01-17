package javaBasic2.ch05.day04;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 2.배열을 먼저 만들어 두고 나중에 값을 넣기
		int[] a1 = new int[5];
		a1[0] = 10;
		a1[1] = 20;
		a1[2] = 30;
		a1[3] = 40;
		a1[4] = 50;
		for (int a : a1) {
			System.out.println(a + " ");
		}
		
		/*
	
		int[] a2 = new int[5]; 
		 int sum = 0; 
		 int max = Integer.MIN_VALUE; 
		 int min =Integer.MAX_VALUE; 
		 System.out.println("숫자 5개를 입력하세요."); 
		 Scanner sc = new Scanner(System.in); 
		 for (int a : a2) { 
			 a = sc.nextInt(); 
			 sum += a; 
			 if (a > max) { 
				 max = a; 
				 } 
			 if (a < min) {
				 min = a; }
		 
		 }
		 
		
		System.out.println(sum); 
		System.out.println("최대값:" + max + " " + "최소값:" + min);
		*/ 
		
		int[] a2 = new int[5];  // 위에서 향상된 for 문으로 받은 값이 다 0으로 나와서 일부러 추가했음..!
		 System.out.println("숫자 5개를 입력하세요."); 
		 Scanner sc = new Scanner(System.in); 
		 for(int a=0;a<a2.length;a++) {
			 a2[a]=sc.nextInt(); 
		 }
		
		int temp;
		for (int i = 0; i < a2.length; i++) { // 앞에칸 제외해야함
			for (int j = i+1; j < a2.length; j++) {
				if (a2[i] > a2[j]) { // j가 i자리로 와야함
					temp = a2[j];
					a2[j] = a2[i];
					a2[i] = temp;
				}
			}
		}
		
		for (int k = 0; k < a2.length; k++) {
			System.out.print(a2[k] + " ");
		}
		

		System.out.println();
		
		for (int i = 0; i < a2.length; i++) { 
			for (int j = i+1; j < a2.length; j++) {
				if (a2[i] < a2[j]) { 
					temp = a2[j];
					a2[j] = a2[i];
					a2[i] = temp;
				}
			}
		}
		
	
		
		for (int k = 0; k < a2.length; k++) {
			System.out.print(a2[k] + " ");
		}

	}

}
