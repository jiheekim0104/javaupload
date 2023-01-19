package javaBasic2.ch05.day05;

import java.util.Scanner;

public class Exch06q9teacher {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		boolean flage = true;
		int scount =0;
		int[] scores = null;
		
		while (flage) {
			System.out.println("----------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("----------------------------------");
			System.out.print("�޴�����: ");
			String menu = sc.nextLine();
			
			
			
			switch ( menu ) {
			case "1" : 
				scount = studentCount();
				break;
				
			case "2" : 
				scores = input(scount);
				break;
				
			case "3" : 
				list(scores); 
				break;
				
			case "4" : 
				analyze(scores);
				break;
			
			case "5" : 
				System.out.println("���α׷� ����");
				flage = false;
				break;
			default : System.out.println("�޴���ȣ�� �ٽ� �Է����ּ���.");
			}		
		}
	}

	private static void analyze(int[] scores) {
		int best=0;
		int sum=0;
		for(int i :scores) {
			if(i>=best) {
				best=i;
			}
			sum+=i;
		}
		System.out.println("�ְ� ����: "+ best);
		System.out.println("��� ����: "+ (double)sum/(scores.length));
	}

	private static void list(int[] scores) {
		for(int i =0;i<scores.length;i++) {
			System.out.println("score["+i+"]:"+scores[i]);
		}
		
	}

	private static int[] input(int scount) {
		int[] scores = new int[scount];
		for(int i =0;i<scount;i++) {
			System.out.print("score["+i+"]:");
			scores[i]=sc.nextInt();
			sc.nextLine();
		}
		return scores;
		
	}

	private static int studentCount() {
		System.out.print("�л���: ");
		int scount= sc.nextInt();
		sc.nextLine();
		return scount;
	}
	
	
	


	


}


