package javaBasic1;

import java.util.Scanner;

public class Continue1 {

	public static void main(String[] args) {
		/*
		for(int i=1;i<=50;i++) {
			if(i%10!=0) 
			System.out.print(i+" ");
		}
		
		for(int i=1;i<=50;i++) {
			if(i%10==0) continue; //�Ʒ� ������ ���������ʰ� �ݺ����� �����ΰ��� �ٽ� ������!
			System.out.print(i+" ");
		}
		*/
		
		/* ��� 1 (�׷��� ���� ����� �ƴ϶�� ������. 500���������� �����ѵ� sum�� 0���� �ʱ�ȭ -> 1000���������� �����ѵ� sum�� 0���� �ʱ�ȭ -> �̷��� �տ� ����� �ߺ��Ǵ� ����̶�..����!) 
		int sum = 0;
		int i=0;
		int number =0;
		for (number=500;number<=5000;number+=500) {
			for(i=100;i>=1;i--) {
				sum = sum + i;
				if(sum>number) break;
			}
		System.out.println("�հ�:"+sum+" "+"�׸�:"+i);
		sum = 0;
		}
		*/
		
		/* ���2 (�̹� �տ��� ���°����� ����� �����ѵ� �̾ ����.)
		int sum = 0;
		int i=100;
		int number =0;
		for (number=500;number<=5000;number+=500) {
			for(;i>=1;i--) {
				sum = sum + i;
				if(sum>number) break;
			}
		System.out.println("�հ�:"+sum+" "+"�׸�:"+i);
		i--;
		}
		*/ 
		
	    /* ���3 (500�� �Ѿ�� �������� ����� �ǰԲ��ϴ� ���, 2���ϰ� �����ϳ� ���� �ٸ�!)
		int baesu = 500;
      	int event = baesu;
      	int sum=0;
      	for(int i=100;i>=0;i--) {
         	sum+=i;
         	if(event < sum) {
         		System.out.println("�հ�: "+sum+" �׸�: "+i);
         		event+=baesu;
         	}
      	}
		*/
		 
		 
	
		System.out.println("-------------------------");
		int nun1;
		int nun2;
		while(true) {
			nun1 = (int)(Math.random()*6)+1;
			nun2 = (int)(Math.random()*6)+1;
			System.out.println("("+nun1+","+nun2+")");
			if(nun1+nun2==5)break;
		}
		
		
		for (int a=1;a<=6;a++) {
			nun1 = (int)(Math.random()*49)+1;
			System.out.print(nun1+" ");
		} //�ζǴ� �ߺ� �ȵ��ڳ�..�Ф� �ߺ� ��� ���� ������?
		
		
		System.out.println();
		System.out.println("-------------------------");
		for (int a=1;a<=5;a++) {
			for (int b=1;b<=a;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		String input = null;
		int menuNumber =0;
		int moneyin =0;
		int moneyout =0;
		int money = 0;
		program : while(true) {
		System.out.println("-------------------------");
		System.out.println("1.���� | 2. ��� | 3.�ܰ� | 4.��ü | 5. ����");
		System.out.println("-------------------------");
		System.out.print("�޴�����:");
		input = sc.next();
		menuNumber = Integer.parseInt(input);
			switch (menuNumber) {
			case 1 : 
				System.out.print("���ݾ�:");
				input = sc.next();
				moneyin=Integer.parseInt(input);
				money = money + moneyin;
				break;
				
			case 2 : 
				System.out.print("��ݾ�:");
				input = sc.next();
				moneyout=Integer.parseInt(input);
				money = money - moneyout;	
				if(money<0) {
					System.out.println("�ܾ׺���");
				}
				break;
				
			case 3 : 
				System.out.println("�ܰ�:"+money);
				break;
				
			case 4 : 
				System.out.print("��ü�� ���¹�ȣ �Է�:");
				input = sc.next();
				String bunho = input;
				System.out.print("��ü�� �ݾ� �Է�:");
				input = sc.next();
				moneyout=Integer.parseInt(input);
				money = money - moneyout;
				if(money<0) {
					System.out.println("�ܾ׺���"); // �ݾ��� �ٽ� �Է��ϰ� �ϰ�ʹ�..! 
					break;
				}
				System.out.println(bunho+"���·� "+moneyout+"���� ��ü�Ǿ����ϴ�.");
				System.out.println("�ܾ��� "+money+"�� �Դϴ�.");
				break;
			case 5 :
				break program;
			default :System.out.println("�߸��Է��ϼ̽��ϴ�.");
			} 
		} 
		System.out.print("���α׷��� ����Ǿ����ϴ�.");
		
		
		
		
		sc.close();
		
	}

}
