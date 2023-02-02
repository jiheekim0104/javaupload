package javaMid5.scoreManage;

import java.util.Scanner;

public class Business {
	// �Է¹ޱ� ���� �ջ��ϱ� ����ϱ�

	public void input(SungJuk sj) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����: ");
		sj.setSubject(sc.nextLine());
		System.out.print("�߰����: ");
		sj.setMidtermExam(Integer.parseInt(sc.nextLine()));
		System.out.print("�⸻���: ");
		sj.setFinals(Integer.parseInt(sc.nextLine()));
		System.out.print("����: ");
		sj.setPerformanceEvalution(Integer.parseInt(sc.nextLine()));

		if (sj instanceof ElementaryStudent) {
			calc(sj);
		} else if (sj instanceof MIddleStudent) {
			MIddleStudent ms = (MIddleStudent) sj;
			System.out.print("��米��: ");
			ms.setTeacher(sc.nextLine());
			System.out.print("�⼮: ");
			ms.setAttendance(Integer.parseInt(sc.nextLine()));
			System.out.print("����: ");
			ms.setService(Integer.parseInt(sc.nextLine()));
			calc(ms);
		} else if (sj instanceof HighStudent) {
			HighStudent hs = (HighStudent) sj;
			System.out.print("��米��: ");
			hs.setTeacher(sc.nextLine());
			System.out.print("�⼮: ");
			hs.setAttendance(Integer.parseInt(sc.nextLine()));
			System.out.print("����: ");
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
		} else if (sj instanceof MIddleStudent) { // high�� midd�� ��ӹ��� ���¶�, ����� �ٷ� �Ʒ� if���� �Ѵ� true �̱⶧���� if�� ������ �ٲ���! 
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
