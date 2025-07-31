package sec01.exam14;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = new String("치킨");
		String strVar2 = "치킨";
		String strVar3 = "치킨";

		if (strVar1 == strVar2) { // 번지가 같나 체크
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}
		if (strVar2 == strVar3) { // 문자열 리터럴이 같으면 공유해서 참조하기때문에 같은 객체를참조
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
		if (strVar2.equals(strVar3)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
	}

}
