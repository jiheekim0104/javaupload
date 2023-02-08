package javaMid10.Ex;

public class Score {
	int score;
	
	public Score() {
		
	}
	

	
	public void getScore(int score)  throws Exception {
		if(score<0) {
			throw new ScoreMinException("0점 미만은 점수는 입력할수 없습니다. ");
		} else if (score>990) {
			throw new ScoreMinException("990점 초과하는 점수는 입력할수 없습니다. ");
		} 
	}
	
	
}
