package javaMid7.ExTea;

import java.util.Scanner;

public class CalBusin {
	Calc calc = new Calc();
	Scanner sc;
	void input() {
		sc = new Scanner(System.in);
		System.out.print("����: ");
		calc.setWidth(Integer.parseInt(sc.nextLine()));
		System.out.print("����: ");
		calc.setHeight(Integer.parseInt(sc.nextLine()));
	}
	
	void print() {
		calc.printA();
	}
	
	Calc calc1 = new Calc() {
		@Override
		void calc() {
			input();
			int result = calc.getWidth() * calc.getHeight();
			print();
			System.out.println("����: " + result);
		}
	};
	
	Calc calc2 = new Calc() {
		@Override
		void calc() {
			int height2;
			input();
			System.out.print("����: ");
			height2 = Integer.parseInt(sc.nextLine());
			int result = calc.getWidth() * calc.getHeight()*height2;
			print();
			System.out.println("����: " + result);
		}
	};
	
}
