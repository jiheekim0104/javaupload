package javaBasic2.ch05.day04;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 2.�迭�� ���� ����� �ΰ� ���߿� ���� �ֱ�
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
		 System.out.println("���� 5���� �Է��ϼ���."); 
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
		System.out.println("�ִ밪:" + max + " " + "�ּҰ�:" + min);
		*/ 
		
		int[] a2 = new int[5];  // ������ ���� for ������ ���� ���� �� 0���� ���ͼ� �Ϻη� �߰�����..!
		 System.out.println("���� 5���� �Է��ϼ���."); 
		 Scanner sc = new Scanner(System.in); 
		 for(int a=0;a<a2.length;a++) {
			 a2[a]=sc.nextInt(); 
		 }
		
		int temp;
		for (int i = 0; i < a2.length; i++) { // �տ�ĭ �����ؾ���
			for (int j = i+1; j < a2.length; j++) {
				if (a2[i] > a2[j]) { // j�� i�ڸ��� �;���
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
