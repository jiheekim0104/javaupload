package javaMid7.ExTea;

import java.util.Scanner;

public class CalBusin {
	Calc calc = new Calc();
	Scanner sc;
	void input() {
		sc = new Scanner(System.in);
		System.out.print("가로: ");
		calc.setWidth(Integer.parseInt(sc.nextLine()));
		System.out.print("세로: ");
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
			System.out.println("넓이: " + result);
		}
	};
	
	Calc calc2 = new Calc() {
		@Override
		void calc() {
			int height2;
			input();
			System.out.print("높이: ");
			height2 = Integer.parseInt(sc.nextLine());
			int result = calc.getWidth() * calc.getHeight()*height2;
			print();
			System.out.println("부피: " + result);
		}
	};
	
}
