package javaMid3.b1331p2;

public class Element extends Grade {
	
	public Element() {
		super("�ʵ��б�");
	}
	
	public Element(String school) {
		super(school);
	}	
	
	
	public void addGrade() {
		System.out.print("�����:");
		subjectName = sc.nextLine();
		System.out.print("�߰����:");
		midScore =Integer.parseInt(sc.nextLine()) ;
		System.out.print("�⸻���:");
		endScore =Integer.parseInt(sc.nextLine()) ;
		System.out.print("������:");
		actScore =Integer.parseInt(sc.nextLine()) ;
		totalScore = midScore + endScore + actScore; 
	}
}
