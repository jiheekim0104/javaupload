package Ex3;

public class Dropship extends Unit {
	int x,y;
	
	@Override
	public void move(int x, int y) {
		this.x = x -100;
		this.y = y -500;
		System.out.println("���ۼ��� ��ġ: "+this.x+","+this.y);
	}

	void load(int x,int y) {
		System.out.println("���ۼ� ������ġ("+x+","+y+")���� ������ �¿��.");
	}
	
	void unload(int x,int y) {
		System.out.println("���ۼ� ��ũ��ġ("+x+","+y+")���� ��ũ���� ������.");
	}
}
