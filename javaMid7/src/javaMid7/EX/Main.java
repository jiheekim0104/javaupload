package javaMid7.EX;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.print("����: ");
			int input1 = Integer.parseInt(sc.nextLine());
			System.out.print("����: ");
			int input2 = Integer.parseInt(sc.nextLine());
			System.out.print("����: ");
			int input3 = Integer.parseInt(sc.nextLine());

			Calc calc = new Calc();
			calc.getNumber(input1, input2, input3);
			calc.output();
			
		}

	}


