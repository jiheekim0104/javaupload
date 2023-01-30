package javaMid3.p297;

public class ColorPoint extends Point {
	String color = "red";
	
	@Override
	void printAll() {
		System.out.println(color + "("+px+","+py+")");
	}
}
