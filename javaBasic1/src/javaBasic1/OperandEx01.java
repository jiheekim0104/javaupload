package javaBasic1;

import java.util.Scanner;

public class OperandEx01 {

	public static void main(String[] args) {
		// ������
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
		System.out.println((v9 == 9) ? "�հ�" : "���հ�");

		String type = "A";
		System.out.println((type.equals("A") ? "VIP���Դϴ�" : "�Ϲݰ��Դϴ�"));

		int c1 =50;
		System.out.println((c1>=25)?"����Ʈ���":"����Ʈ�̴��");
		
		String d1 = "�ڹ�";
		System.out.println((d1.equals("�ڹ�")?"A�����Դϴ�.":"B,C�����Դϴ�."));		
		
		Scanner sc = new Scanner(System.in);
		/*System.out.println("����1 �Է�:");
		int e1 = sc.nextInt();
		System.out.println("����2 �Է�:");
		int e2 = sc.nextInt();
        System.out.println((e1>e2)?e1:e2);	*/	
        
        // 3�� ���غ���!
       /*  System.out.println("--------�ָ�����!---------");	
        System.out.println("����1 �Է�:");
        int e3 = sc.nextInt();
        System.out.println("����2 �Է�:");
        int e4 = sc.nextInt();
        System.out.println("����3 �Է�:");
        int e5 = sc.nextInt();	
        System.out.println((e3>=e4)?((e3>=e4)?e3:e4):((e4>=e5)?e4:e5)); */
        
        /* 
          int maxNumber = (e3>=e4)?e3:e4;
          maxNumber = (maxnNumber>=e5)?maxnumber:e5; */
        
        // ���� 3���� �Է¹ް� �߰� ���ڸ� ����ϱ�
        /* System.out.println("����1 �Է�:");
        int e6 = sc.nextInt();
        System.out.println("����2 �Է�:");
        int e7 = sc.nextInt();
        System.out.println("����3 �Է�:");
        int e8 = sc.nextInt();	
        System.out.println((e6>=e7)?((e6>=e8)?((e7>=e8)?e7:e8):e6):((e6>=e8)?e6:((e7>=e8)?e8:e7))); */
        
		/*
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		int number1 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		int number2 = sc.nextInt();
		System.out.print("����° ���ڸ� �Է��ϼ��� : ");
		int number3 = sc.nextInt();

		int result1 = (number1 <= number2) ? number1 : number2;
		int min = (result1 <= number3) ? result1 : number3;
		
		int result2 = (number1 >= number2) ? number1 : number2;
		int max = (result2 >= number3) ? result2 : number3;
		int mid = (number1 != min && number1 != max) ? number1 : ((number2 != min && number2 != max) ? number2 : number3);
		
		System.out.println(mid);

		 */
        
        Scanner Scr = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է�==>");
		int number6=Scr.nextInt();
		System.out.print("�ι�° ���ڸ� �Է�==>");
		int number7=Scr.nextInt();
		System.out.print("����° ���ڸ� �Է�==>");
		int number8=Scr.nextInt();
		
		int middleNumber = (number6>=number7)? number6:number7;
		middleNumber = (number8>=middleNumber)? ((number7>number8)?number8:number7):number7;
		System.out.println(middleNumber);

        
        

        
	}

}
