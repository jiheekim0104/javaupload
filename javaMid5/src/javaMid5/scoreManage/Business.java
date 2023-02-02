package javaMid5.scoreManage;

import java.util.Scanner;

public class Business {
	// 입력받기 점수 합산하기 출력하기

	public void input(SungJuk sj) {
		Scanner sc = new Scanner(System.in);
		System.out.print("과목명: ");
		sj.setSubject(sc.nextLine());
		System.out.print("중간고사: ");
		sj.setMidtermExam(Integer.parseInt(sc.nextLine()));
		System.out.print("기말고사: ");
		sj.setFinals(Integer.parseInt(sc.nextLine()));
		System.out.print("수행: ");
		sj.setPerformanceEvalution(Integer.parseInt(sc.nextLine()));

		if (sj instanceof ElementaryStudent) {
			calc(sj);
		} else if (sj instanceof MIddleStudent) {
			MIddleStudent ms = (MIddleStudent) sj;
			System.out.print("담당교사: ");
			ms.setTeacher(sc.nextLine());
			System.out.print("출석: ");
			ms.setAttendance(Integer.parseInt(sc.nextLine()));
			System.out.print("봉사: ");
			ms.setService(Integer.parseInt(sc.nextLine()));
			calc(ms);
		} else if (sj instanceof HighStudent) {
			HighStudent hs = (HighStudent) sj;
			System.out.print("담당교사: ");
			hs.setTeacher(sc.nextLine());
			System.out.print("출석: ");
			hs.setAttendance(Integer.parseInt(sc.nextLine()));
			System.out.print("봉사: ");
			hs.setService(Integer.parseInt(sc.nextLine()));
			calc(hs);
		}

	}

	void print(SungJuk sj) {
		sj.printAll();
	}

	void calc(SungJuk sj) {
		if (sj instanceof ElementaryStudent) {
			sj.setScore(sj.getMidtermExam() + sj.getFinals() + sj.getPerformanceEvalution());
		} else if (sj instanceof MIddleStudent) { // high가 midd을 상속받은 상태라서, 여기랑 바로 아래 if문이 둘다 true 이기때문에 if문 순서를 바꿔줌! 
			HighStudent hs = (HighStudent) sj;
			hs.setScore(hs.getMidtermExam() + hs.getFinals() + hs.getPerformanceEvalution() + hs.getAttendance()
					+ hs.getService());
			hs.setStandard(23.17);
		} else if (sj instanceof MIddleStudent) {
			MIddleStudent ms = (MIddleStudent) sj;
			ms.setScore(ms.getMidtermExam() + ms.getFinals() + ms.getPerformanceEvalution() + ms.getAttendance()
					+ ms.getService());
		} 
			
		

	}

}
