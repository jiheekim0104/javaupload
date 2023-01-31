package javaMid3.b1328Ex2;

public class PolyArgumentTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Phone());
		b.buy(new Ipad());
		b.summary();
	}

}
