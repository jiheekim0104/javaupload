package javaBasic2.ch05.day05;

import java.util.Scanner;

public class Exch06q91 {
	
	static Scanner sc = new Scanner(System.in);
	static String input;
	static int studentNumber=0;
	static int[] array;
	
	
	public static void main(String[] args) {
		
		boolean flage = true;
		
		while (flage) {
			System.out.println("----------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("----------------------------------");
			System.out.print("�޴�����: ");
			String menu = sc.nextLine();

			switch ( menu ) {
			case "1" : 
				studentCount();
				break;
				
			case "2" : 
				input();
				break;
				
			case "3" : 
				list(); 
				break;
				
			case "4" : 
				analyze();
				break;
			
			case "5" : 
				System.out.println("���α׷� ����");
				flage = false;
				break;
			default : System.out.println("�޴���ȣ�� �ٽ� �Է����ּ���.");
			}		
		}
	}
	


	private static void analyze() {
		int best=0;
		int sum=0;
		int cnt=0;
		for(int score:array) {
			if(score>=best) {
				best = score;
			}
			sum+=score;
			cnt++;
			}
		System.out.println("�ְ� ����: "+best);
		System.out.println("��� ����: "+ (double)sum/cnt );
		}
		
	
	private static void list() {
		for(int i=0;i<studentNumber;i++)  {
			System.out.println("array["+i+"]: "+array[i]);
		}
		
	}

	private static void input() {
		for(int i=0;i<studentNumber;i++) {
			System.out.print("array["+i+"]: ");
			array[i]=Integer.parseInt(sc.nextLine());
		}
		
	}

	private static void studentCount() {
		System.out.print("�л���:");
		input = sc.nextLine();
		studentNumber = Integer.parseInt(input);
		array = new int[studentNumber];
	}


}


