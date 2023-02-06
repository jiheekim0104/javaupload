package javaMid7.EX;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.print("가로: ");
			int input1 = Integer.parseInt(sc.nextLine());
			System.out.print("세로: ");
			int input2 = Integer.parseInt(sc.nextLine());
			System.out.print("높이: ");
			int input3 = Integer.parseInt(sc.nextLine());

			Calc calc = new Calc();
			calc.getNumber(input1, input2, input3);
			calc.output();
			
		}

	}


