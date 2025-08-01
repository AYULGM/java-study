package sec01.exam26;

public class ValueCompareExample {

	public static void main(String[] args) {
		// Wrapper 객체 내부의 값을 비교할 때는 ==을 사용하지 않는게 좋음 ( ==비교는 객체의 주소비교니깐)
		// 언박싱 한 값으로 비교하거나, equals() 메소드를 사용
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj1 = 300; // 자동 박싱
		Integer obj2 = 300; // 자동 박싱
		System.out.println("==결과: " + (obj1 == obj2)); // 두개의 주소값은 다름
		System.out.println("언박싱 후 ==결과: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals() 결과: " + obj1.equals(obj2)); // Wrapper 클래스에 재정의된 equals를 사용
		System.out.println();
		
		// 예외: 범위값 안에 들어갈 경우 하나의 Integer 객체를 공유한다.  (굳이 범위 외우거나 알고있을필요 없다고하심)
		System.out.println("[-128~127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과: " + (obj3 == obj4)); // obj3과 obj4는 같은 객체를 참조함
		System.out.println("언박싱 후 ==결과: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과: " + obj3.equals(obj4)); 
		
		// 굳이 예외 범위를 알고 있을 필요 없이 내부의 값을 비교할 때는 
		// equals() 메소드 사용
	}

}
