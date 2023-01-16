package javaBasic2.ch05.day02;

public class ClassEx153page {

	public static void main(String[] args) {
		String name = "홍길동";
		String name1 = "홍길동";
		String name2 = new String("홍길동");
		
		name.replace("홍길동", "김지희");
		
		
		String personId = "940104-2000000";
		String year = personId.substring(0,2);
		System.out.print(19+year+"년 ");
		
		String month = personId.substring(2,4);
		System.out.print(month+"월 ");
		
		String day = personId.substring(4,6);
		System.out.print(day+"일 ");
		
		String gender = personId.substring(7,8);
		if (gender.equals('1')||gender.equals('3')) {
			System.out.print("남성");
		} else {
			System.out.print("여성");
		}
		
		/* 숫자로 변환해서 풀기 
		String gender1 = personId.substring(7,8);
		int numgender1 = Integer.parseInt(gender1);
		if (numgender1==1||numgender1==3) {
			System.out.print("남성");
		} else {
			System.out.print("여성");
		}
		*/
		
		
				

	}

}
