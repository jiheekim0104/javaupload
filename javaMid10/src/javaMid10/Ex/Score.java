package javaMid10.Ex;

public class Score {
	int score;
	
	public Score() {
		
	}
	

	
	public void getScore(int score)  throws Exception {
		if(score<0) {
			throw new ScoreMinException("0�� �̸��� ������ �Է��Ҽ� �����ϴ�. ");
		} else if (score>990) {
			throw new ScoreMinException("990�� �ʰ��ϴ� ������ �Է��Ҽ� �����ϴ�. ");
		} 
	}
	
	
}
