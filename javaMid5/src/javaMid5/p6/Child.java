package javaMid5.p6;

public class Child extends Parent {
	public int studentNo;
	
	public Child (String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
	
	// �Ǵ� super�� ���������������, �θ� �⺻ ������(���) ������ְ� this.name = name�� �״�� ���¹���� �ִ�.
	// �׷� �� �θ��� �⺻�����ڰ� ���� ��üȭ�Ǿ �ڽ� ��ü �����ÿ� ������ ���� �ʴ´�.
	
}
