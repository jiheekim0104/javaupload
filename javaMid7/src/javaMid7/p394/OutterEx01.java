package javaMid7.p394;


public class OutterEx01 {
	 public static void main(String[] args) {
		 OutterA outterA = new OutterA();  // �ۿ� ��ü �����,
		 //OutterA.InnerA innerA = outterA.new InnerA(); // �ȿ� �ִ� ��ü�� ��������..! 
		 
		 
		 OutterB.InnerB innerB = new OutterB.InnerB(); // �ٵ� ����� static�̶� ��ü ������������ �ʾƵ� �̷��� ��������! 
		 innerB.ia = 100;
		 innerB.iaM();
		 innerB.sia = 50;
		 innerB.siaM();
		 
		 
		 
		OutterA.InnerAEx innerAEx = outterA.new InnerAEx();
		System.out.println(innerAEx.sumCalc());
		
		OutterB.InnerBEx innerBEx = new OutterB.InnerBEx();
		innerBEx.sibM();
		System.out.println("---------------");
		
		OutterB outterB = new OutterB();
		outterB.iaM2();
		
		OutterC outterC = new OutterC();
		outterC.iaM();
		System.out.println("---------------");
		OutterD.sM();
	}
}
