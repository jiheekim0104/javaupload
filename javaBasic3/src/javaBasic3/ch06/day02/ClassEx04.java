package javaBasic3.ch06.day02;

public class ClassEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c = new Computer();
		System.out.println(c.sum(1,2));
		System.out.println(c.sum(1,2,3,4));
		System.out.println(c.cc("a","b"));
		System.out.println(c.cc("a","b","c"));
		System.out.println(c.cc("a","b","c","d"));
	}

}

class Computer {
	//메소드명은 동일하나 매가변수가 다른 것 - 메소드 재사용(오버로딩)
	/*
	int sum(int a,int b) {
		return a+b;
	}
	
	int sum(int a,int b,int c,int d) {
		return a+b+c+d;
	}
	*/
	
	int sum(int ...values) {
		int sum = 0 ;
		for(int i=0; i<values.length;i++) {
			sum+=values[i];
		}
		return sum;
	}
	
	String cc(String ...a) {
		String word = null;
		for(int i=0; i<a.length;i++) {
			word +=a[i];
		}
		return word;
	}
}