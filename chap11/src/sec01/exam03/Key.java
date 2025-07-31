package sec01.exam03;

import java.util.Objects;

public class Key {
	public int number;

	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("재정의된 equals() 호출");
		if (obj instanceof Key compareKey) { //obj로 들어온게 Key클래스의 인스턴스가 맞는지 맞으면 obj는 Key로 타입변환
			if (this.number == compareKey.number) {
				return true; // 같으면 true
			}
		}
		return false; // 다르면 false
	}
	
//	@Override
//	public int hashCode() {
//		System.out.println("재정의된 hashCode() 호출");
//		// number가 같은 모든 Key 객체는 동일한 해시코드가 나오게 만들어줌(조작해줌)
//		return number;
//	}

	// 해시코드 만드는 더 쉬운 방법
	// Objects.hash(...)
	// 자바에서 여러 필드를 조합하여 간편하게 hashCode()를 만들 수 있도록 제공되는 유틸리티 메소드
	// 가변 인자를 받아서 자동으로 적절한 해시코드를 계산해줌
	@Override
	public int hashCode() { // ...은 몇개의 매개변수를 쓸지 모를때 쓰는 가변인수
		return Objects.hash(number); // 필드가 여러개있으면 , 하고 필드명1,필드명2 쓰면됨
	}
	
}
