package javaMid5.scoreManage;

public class HighStudent extends MIddleStudent {
	double standard;
	
	@Override
	public String toString() {
		return "����л�";
	}
	
	@Override
	void printAll() {
		System.out.println("-------------");
		System.out.println("���б� ����");
		System.out.println("-------------");
		System.out.println("�����: "+ getSubject());
		System.out.println("��米��: "+ getTeacher());
		System.out.println("����: �߰����("+getMidtermExam()+") �⸻���("+getFinals()+") ������("+ getPerformanceEvalution() +") �⼮����("+getAttendance()+") ��������("+getService()+")");
		System.out.println("����: "+ getScore());
		System.out.println("ǥ������: "+ getStandard());
	}

	public double getStandard() {
		return standard;
	}

	public void setStandard(double standard) {
		this.standard = standard;
	}
}
