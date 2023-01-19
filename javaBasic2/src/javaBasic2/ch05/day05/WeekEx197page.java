package javaBasic2.ch05.day05;

import java.util.Calendar;

public class WeekEx197page {

	public static void main(String[] args) {
		// 열거형 사용 연습
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DATE);
		
		
		
		System.out.println( day);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (week) {
		case 1: 
			today = Week.SUNDAY;
			break;
		case 2: 
			today = Week.MONDAY;
			break;
		case 3: 
			today = Week.TUESDAY;
			break;
		case 4: 
			today = Week.WEDNESDAY;
			break;
		case 5: 
			today = Week.THURSDAY;
			break;
		case 6: 
			today = Week.FRIDAY;
			break;
		case 7: 
			today = Week.SATURDAY;		
		}
		
		if(week==7) {
			System.out.println("저녁식사!");
			}
		
		
		LoginResult result = null;
		result = LoginResult.LOGIN_SUCCESS;
		
		result = LoginResult.LOGGING;
		
	}

}
