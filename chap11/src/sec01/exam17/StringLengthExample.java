package sec01.exam17;

public class StringLengthExample {

	public static void main(String[] args) {
		String ssn = "9905101557155"; // 주민번호 13자리
		int length = ssn.length();
		
		if (length == 13) {
			System.out.println("주민번호 자리수 맞음");
		}
		else {
			System.out.println("주민번호 자리수 틀림");
		}
		
	}

}
