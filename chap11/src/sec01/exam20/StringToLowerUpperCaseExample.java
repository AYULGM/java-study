package sec01.exam20;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2)); // 대소문자를 구분하기때문에 false 나옴
		
		// 대소문자 상관없이 비교하고 싶을 때
		// 방법 1
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1);
		System.out.println(lowerStr2);
		System.out.println(lowerStr1.equals(lowerStr2));
		
		// 방법 2 (더 간단한)
		System.out.println(str1.equalsIgnoreCase(str2)); // 대소문자 구분하지않고 equals 구분 true
	}

}
