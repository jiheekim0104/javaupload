package dao;

public class BookDao {
	private String name;
	private int age;
	private int score;
	public String getName() {
		return name;
	}
	
	public BookDao() {
		
	}
	
	public void a (String name, int age , int score) {
		this.setName(name);
		this.age = age;
		this.score = score;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
