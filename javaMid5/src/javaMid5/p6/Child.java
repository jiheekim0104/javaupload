package javaMid5.p6;

public class Child extends Parent {
	public int studentNo;
	
	public Child (String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
	
	// 또는 super를 사용하지않으려면, 부모에 기본 생성자(빈거) 만들어주고 this.name = name을 그대로 쓰는방법도 있다.
	// 그럼 그 부모의 기본생성자가 먼저 객체화되어서 자식 객체 생성시에 오류가 나지 않는다.
	
}
