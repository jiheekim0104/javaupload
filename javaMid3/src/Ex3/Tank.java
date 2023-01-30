package Ex3;

public class Tank extends Unit {
	int x;
	int y;
	
	@Override
	public void move(int x,int y) {
		this.x = x - 50;
		this.y = y + 50;
		System.out.println("탱크의 위치: "+this.x+","+this.y);
	}

	 void changeMode() {
		 System.out.println("탱크 공격모드를 변환한다.");
	 }
}
