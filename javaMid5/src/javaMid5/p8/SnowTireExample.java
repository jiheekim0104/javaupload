package javaMid5.p8;

public class SnowTireExample {

	public static void main(String[] args) {
		Snowtire snowtire = new Snowtire();
		Tire tire = snowtire;
		
		snowtire.run();
		tire.run();

	}

}
