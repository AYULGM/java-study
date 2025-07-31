package sec01.exam13;

public class StringCharAtExample {

	public static void main(String[] args) {
		// 주민등록번호에서 남자와 여자를 구분하는 방법
		String ssn = "010624-1230123";
		
		char gender = ssn.charAt(7); // 문자열에서 특정 인덱스의 문자 추출
		
		switch (gender) { // switch 에서 () 안에 정수 , 문자 ,문자열만 들어갈수있음
		case '1':
		case '3':
			System.out.println("얘는 남자입니다.");
			break;
			
		case '2':
		case '4':
			System.out.println("얘는 여자입니다.");
			break;
			
		default:
			System.out.println("주민번호 뒷자리 첫번째 숫자를 1~4로 입력해주세요.");
			break;
		}
	}

}
