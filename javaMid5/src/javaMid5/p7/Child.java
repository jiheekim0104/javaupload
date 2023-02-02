package javaMid5.p7;

public class Child extends Parent {
	public String name;
	
	public Child() {
		this("ȫ�浿");
		System.out.println("Child() call");
	}
	
	public Child (String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
