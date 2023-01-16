package javaBasic2.ch05.day03;

public class Ex033 { // Ex03에서는 왜 실행안되는지 이유 찾을것

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		tv1.setTvSize(15);
		tv1.setTvPrice(3000000);
		tv1.setTvName("tv-m 1500");
		System.out.println(tv1.getTvSize()+" "+tv1.getTvPrice()+" "+tv1.getTvName());

	}

}

class Tv{
	int tvSize;
	int tvPrice;
	String tvName;
	public int getTvSize() {
		return tvSize;
	}
	public void setTvSize(int tvSize) {
		this.tvSize = tvSize;
	}
	public int getTvPrice() {
		return tvPrice;
	}
	public void setTvPrice(int tvPrice) {
		this.tvPrice = tvPrice;
	}
	public String getTvName() {
		return tvName;
	}
	public void setTvName(String tvName) {
		this.tvName = tvName;
	}
	
}
