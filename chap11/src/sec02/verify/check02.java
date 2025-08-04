package sec02.verify;

import java.util.Calendar;

public class check02 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		
		int year = now.get(Calendar.YEAR); // 연도  , Calendar.YEAR대신 1이라 해도되는데 가독성문제
		int month = now.get(Calendar.MONTH) + 1; // 월: 0~11   0부터시작? 사용성이 떨어짐
		 String strMonth = (month<10)? ("0"+month) : (""+month);
		int day = now.get(Calendar.DAY_OF_MONTH); // 일: 1~31
		 String strDayOfMonth = (day<10)? ("0"+day) : (""+day);

		
		System.out.print(year + "년 ");
		System.out.print(strMonth + "월 ");
		System.out.print(strDayOfMonth + "일 ");
		
		int week = now.get(Calendar.DAY_OF_WEEK); // 요일: 1(일) ~ 7(토)
		String strWeek = null; // 숫자를 문자열로 바꿔줄 공간 만들어놓기
		
		switch (week) { //if문 써도되는데 switch문이 깔끔
		case Calendar.MONDAY: strWeek = "월"; break;  //숫자를 문자열로 바꿔준다.
		case Calendar.TUESDAY: strWeek = "화"; break;
		case Calendar.WEDNESDAY: strWeek = "수"; break;
		case Calendar.THURSDAY: strWeek = "목"; break;
		case Calendar.FRIDAY: strWeek = "금"; break;
		case Calendar.SATURDAY: strWeek = "토"; break;
		case Calendar.SUNDAY: strWeek = "일"; break;
		}
		
		System.out.print(strWeek + "요일 ");	
		
		int hour = now.get(Calendar.HOUR); // 시
		int minute = now.get(Calendar.MINUTE); // 분

		
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");

	}

}
