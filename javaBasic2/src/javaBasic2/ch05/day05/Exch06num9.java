package javaBasic2.ch05.day05;

import java.util.Scanner;

public class Exch06num9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;

				
		boolean flage = true;
		
		while (flage) {
			System.out.println("----------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("----------------------------------");
			System.out.println("�޴�����: ");
			String menu = sc.nextLine();

			switch ( menu ) {
			case "1" : 
				System.out.print("�л���: ");
				input = sc.nextLine();
				studentCount(Integer.parseInt(input));
				
				break;
				
			case "2" : input();
				
				break;
				
			case "3" : list(); 
				break;
				
			case "4" : analyze();
				
				break;
			
			case "5" : 
				flage = false;
				break;
			default : System.out.println("�޴���ȣ�� �ٽ� �Է����ּ���.");
			}
			
			
			
			
		}
		

	}
	
	
private static void studentCount(int parseInt) {
		// TODO Auto-generated method stub
		
	}
class ExamProgram{
	int studentent;
	

	void studentCount(int studentent) {
		this.studentent=studentent;
	}

}

}
