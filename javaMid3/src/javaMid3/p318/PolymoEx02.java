package javaMid3.p318;

public class PolymoEx02 {

	public static void main(String[] args) {
		Driver driver = new Driver();
		//Vehicle vehicle = new Vehicle();
		//vehicle.run();
		
		Bus bus = new Bus();
		driver.drive(bus);
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);

	}

}
