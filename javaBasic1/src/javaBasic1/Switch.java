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
		System.out.print("�̸�:");
		String name = sc.nextLine();
		switch (name) {
			case "ȫ�浿" : System.out.println("�꿡 ��ϴ�");
				break;
			case "�̼���" : System.out.println("�ٴٿ� ��ϴ�");
				break;
			case "������" : System.out.println("������ ��ϴ�");
				break;
			default : System.out.println("���� ��ϴ�");
		}
		
		System.out.println("-------------------------");
		int number=0;
		int sum =0;
		int cnt =0;
		for(int i=1;i<=3;i++) {
		System.out.print("����"+i+":");
		number = sc.nextInt();
		sum =sum + number;
		cnt++;
		}
		double avg = (double)sum/cnt;
		System.out.print("���:"+avg);
		switch ((int)avg/10) {
			case 10 : //case�� ����ְ� �Ʒ� ������ ����ǰ���..!
			case 9 :System.out.print(" A����");
				break;
			case 8 :System.out.print(" B����");
				break;
			case 7 :System.out.print(" C����");
				break;
			case 6 :System.out.print(" D����");
				break;
			default :System.out.print(" F����");
		}
		
		System.out.println("-------------------------");
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		}

}
