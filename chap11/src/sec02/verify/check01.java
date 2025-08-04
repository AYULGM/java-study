package sec02.verify;

import java.text.SimpleDateFormat;
import java.util.Date;

public class check01 {

	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 EEEE hh시 mm분");
		String strNow2 = sdf.format(now); // 원하는 날짜 포맷으로 문자열 반환
		System.out.println(strNow2);
	}

}
