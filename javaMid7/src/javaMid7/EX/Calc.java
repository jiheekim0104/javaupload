package javaMid7.EX;

public class Calc {
	int input1 = 0;
	int input2 = 0;
	int input3 = 0; 
	public void getNumber (int input1,int input2,int input3) {
		this.input1 = input1;
		this.input2 = input2;
		this.input3 = input3;
	}
	
	private Square square1 = new Square() {
		@Override
		public void calcSquare () {
			System.out.println(input1*input2);
		}
		
	};

	private Square square2 = new Square() {
		@Override
		public void calcSquare () {
			System.out.println(input1*input2*input3);
		}
	};
	
	private Square square3 = new Square() {
		@Override
		public void calcSquare () {
			System.out.println((input1*input2+input2*input3+input1*input3)*2);
		}
	};
	
	public void output() {
		System.out.println("∞°∑Œ: "+input1+" ºº∑Œ: "+input2+" ≥Ù¿Ã: "+input3);
		System.out.print("≥–¿Ã: " );
		square1.calcSquare();
		System.out.print("∫Œ««: ");
		square2.calcSquare();
		System.out.print("∞—≥–¿Ã: ");
		square3.calcSquare();
	}

	
}
