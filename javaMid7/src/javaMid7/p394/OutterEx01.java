package javaMid7.p394;


public class OutterEx01 {
	 public static void main(String[] args) {
		 OutterA outterA = new OutterA();  // 밖에 객체 만들고,
		 //OutterA.InnerA innerA = outterA.new InnerA(); // 안에 있는 객체를 만들어야해..! 
		 
		 
		 OutterB.InnerB innerB = new OutterB.InnerB(); // 근데 여기는 static이라서 객체 생성따로하지 않아도 이렇게 쓸수있음! 
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
