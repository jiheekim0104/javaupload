package Ex3;

public class Dropship extends Unit {
	int x,y;
	
	@Override
	public void move(int x, int y) {
		this.x = x -100;
		this.y = y -500;
		System.out.println("수송선의 위치: "+this.x+","+this.y);
	}

	void load(int x,int y) {
		System.out.println("수송선 보병위치("+x+","+y+")에서 보병을 태운다.");
	}
	
	void unload(int x,int y) {
		System.out.println("수송선 탱크위치("+x+","+y+")에서 탱크병을 내린다.");
	}
}
