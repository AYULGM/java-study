package sec01.exam19;

public class StringSubstringExample {

	public static void main(String[] args) {
		String ssn = "990510-1234567";

		String firstNum = ssn.substring(0, 6); // Index 0부터 5까지 추출됨. 6(제외)
		System.out.println(firstNum);

		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		// 확장자가 .jpg 인지 .avi인지 확인할때 쓰인다 함
		
	} // 2025.08.01 am 10:17

}
