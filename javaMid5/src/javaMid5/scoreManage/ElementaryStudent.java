package javaMid5.scoreManage;

public class ElementaryStudent extends SungJuk{

	@Override
	public String toString() {
		return "�ʵ��л�";
	}
	
	@Override
	void printAll() {
		System.out.println("-------------");
		System.out.println("�ʵ��б� ����");
		System.out.println("-------------");
		System.out.println("�����: "+ getSubject());
		System.out.println("����: �߰����("+getMidtermExam()+") �⸻���("+getFinals()+") ������("+ getPerformanceEvalution() +")");
		System.out.println("����: "+ getScore());
	}
}
