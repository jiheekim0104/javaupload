package javaMid5.scoreManage;

public class MIddleStudent extends SungJuk {
	private String teacher;
	private int attendance;
	private int service;
	
	@Override
	void printAll() {
		System.out.println("-------------");
		System.out.println("���б� ����");
		System.out.println("-------------");
		System.out.println("�����: "+ getSubject());
		System.out.println("��米��: "+ getTeacher());
		System.out.println("����: �߰����("+getMidtermExam()+") �⸻���("+getFinals()+") ������("+ getPerformanceEvalution() +") �⼮����("+getAttendance()+") ��������("+getService()+")");
		System.out.println("����: "+ getScore());
	}
	
	
	
	
	public String getTeacher() {
		return teacher;
	}



	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}



	public int getAttendance() {
		return attendance;
	}



	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}



	public int getService() {
		return service;
	}



	public void setService(int service) {
		this.service = service;
	}



	@Override
	public String toString() {
		return "���л�";
	}
	
}
