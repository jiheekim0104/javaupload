package javaMid3.b1331Ex2;

public class Elementary extends Grade {
	String subjectName;
	int middlescore;
	int endscore;
	int actscore;
	int totalscore;

	@Override
	public void addScore(String subjectName,int middlescore,int endscore,int actscore) {
		this.subjectName = subjectName;
		this.middlescore = middlescore;
		this.endscore = endscore;
		this.actscore = actscore;
	}
	
	
	@Override
	public int getTotal() {
		return totalscore = middlescore + endscore + actscore; 
	}
}
