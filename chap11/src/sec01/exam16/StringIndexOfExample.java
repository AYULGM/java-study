package sec01.exam16;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
//		String subject = "C 프로그래밍";
		
		int location = subject.indexOf("프로그래밍"); // 찾는 문자열 대입
		System.out.println("location: " + location); // 3이나옴 , "프"가 시작하는 인덱스
		
		if(subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요");
		}
		else {
			System.out.println("자바와 관련없는 책이군요");
		}
		
		// 참고: 문자열 포함 여부를 알려주는 메소드 (교재에 없음) 단순히 문자열이 들어있는지 체크하겠다면~
		if (subject.contains("자바")) { // contains 마우스올려보면 boolean타입(T/F) 으로 반환
			System.out.println("자바와 관련O");
		}
		else {
			System.out.println("자바와 관련X");
		}
		
		
		
	}

}
