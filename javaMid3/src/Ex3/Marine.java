package Ex3;

public class Marine extends Unit {
	//int x;
	//int y; (2) 고로 이걸 안써도 되는것이었다..! 
	
	@Override
	public void move(int x, int y) {
		this.x =x + 10; // (1) 만약 필드에 int x,y가 이 클래스에 없었다면 부모 값으로 바로 들어가짐 ㅇㅇ
		this.y =y - 10;
		System.out.println("보병의 위치: "+this.x+","+ this.y);
	}
	
	void stimPack() {
		System.out.println("보병 스팀팩을 사용한다.");
	}
}
