package javaBasic2.ch05.day02;

public class WeekHw {

	public static void main(String[] args) {
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

	}

}
