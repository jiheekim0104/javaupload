package exBasic;

public class MyFirst {

	public static void main(String[] args) {
		String colleage; // 대학명
		String department; // 학과
		String id; // 학번
		
		colleage = "서울대학교";
		department = "컴퓨터공학과";
		id = "2023110022";
		System.out.println(colleage);
		System.out.println(department);
		System.out.println(id);
		
		System.out.println("-----------");
		
		System.out.println("학교:" + colleage);
		System.out.println("학과:" + department);
		System.out.println("학번:" + id);
		
		System.out.println("-----------");
		
		System.out.println("학번:" + colleage + ",학과:" + department + ",학번:" + id);
		
		System.out.println("-----------");
		
		System.out.print("학교:" + colleage);
		System.out.print("학과:" + department);
		System.out.print("학번:" + id);

		System.out.println("-----------");
		
		System.out.printf("학교: %s,학과: %s,학번: %s", colleage,department,id);
	
		
		
	}

}
