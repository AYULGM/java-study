package sec01.exam03;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// 배우진 않았지만 hash Map 컬렉션 써봄
		// Map: key/value 값을 하나로 묶어 쌍으로 저장하는 컬렉션(추후 학습)
		// Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		// < > 이런거는 제네릭이라고 함 , 그 안에는 데이터 타입을 집어넣음
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		// 식별키로 "new Key(1)"로 "홍길동"이라는 문자열을 저장함
		// 저장할때는 put을 사용하면됨
		hashMap.put(new Key(1), "홍길동");
		// 맵은 키값으로 데이터를 불러올수있음
		
		// 식별키 "new Key(1)"로 "홍길동"을 읽어옴
		// 데이터를 가져올때는 get를 사용하면됨
		String value = hashMap.get(new Key(1)); //get이 담는게 String이라 String타입 변수 선언
		System.out.println(value);
		// equals() 메소드를 재정의 했음에도 동등 객체(같은 식별키)로 판단하지 않는다.
		// get()을 할 때, hashCode()를 먼저 비교하고 그 다음 equals()로 비교하기 때문
		// hashCode()도 재정의 필요
		// => 그래서 hashMap의 키로는 String이 가장 많이 사용됨(String은 이미 hashCode()와 equals()가 재정의 되어있음)
		// 그러면 HashMap<Key, String> 이렇게 안쓰고 HashMap<String, String> 이렇게 쓰는거지
		// 만약 사용자 정의 객체를 키로 쓸 때는 hashCode()와 equals()를 반드시 오버라이드해야 버그 없이 작동
		
		// 참고
		// hashCode()가 재정의된 대표적인 예
		String str1 = "아몰라";
		String str2 = "아몰라";
		String str3 = new String("아몰라");
		String str4 = new String("아몰라");
		
		// 다른 객체여도 같은 해시코드를 가짐
		// => String 클래스에 재정의 된 hashCode() 호출
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode()); // str1과 str2는 같은 주소의 객체를 참조함
		System.out.println(str3.hashCode()); // 내부문자열이 같으면 해시코드가 같게끔 재정의 되어있음
		System.out.println(str4.hashCode()); // 그래서 총 3개의 객체가 생성됨
		
		// 시스템이 구성한 값 그대로 출력 (재정의된 해시코드가 아니고)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
				
		
	}

}
