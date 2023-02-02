package javaMid5.scoreManage;

public class HighStudent extends MIddleStudent {
	double standard;
	
	@Override
	public String toString() {
		return "고등학생";
	}
	
	@Override
	void printAll() {
		System.out.println("-------------");
		System.out.println("중학교 성적");
		System.out.println("-------------");
		System.out.println("과목명: "+ getSubject());
		System.out.println("담당교사: "+ getTeacher());
		System.out.println("시험: 중간고사("+getMidtermExam()+") 기말고사("+getFinals()+") 수행평가("+ getPerformanceEvalution() +") 출석점수("+getAttendance()+") 봉사점수("+getService()+")");
		System.out.println("점수: "+ getScore());
		System.out.println("표준편차: "+ getStandard());
	}

	public double getStandard() {
		return standard;
	}

	public void setStandard(double standard) {
		this.standard = standard;
	}
}
