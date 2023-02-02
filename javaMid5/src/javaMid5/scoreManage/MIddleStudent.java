package javaMid5.scoreManage;

public class MIddleStudent extends SungJuk {
	private String teacher;
	private int attendance;
	private int service;
	
	@Override
	void printAll() {
		System.out.println("-------------");
		System.out.println("중학교 성적");
		System.out.println("-------------");
		System.out.println("과목명: "+ getSubject());
		System.out.println("담당교사: "+ getTeacher());
		System.out.println("시험: 중간고사("+getMidtermExam()+") 기말고사("+getFinals()+") 수행평가("+ getPerformanceEvalution() +") 출석점수("+getAttendance()+") 봉사점수("+getService()+")");
		System.out.println("점수: "+ getScore());
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
		return "중학생";
	}
	
}
