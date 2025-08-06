package sec01.exam07;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		// new 연산자로 생성했기 때문에 서로 다른 객체
		// 내부 데이터가 같을 때 동등 키로 판단하려면 hashCode()와 equals()를 재정의
		map.put(new Student(1, "김재현"), 95);
		map.put(new Student(1, "김재현"), 100);
		
		System.out.println(map.get(new Student(1, "김재현"))); // 재정의하지않으면 검색도 X / 키 값으로 value를 찾아오는 get
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
	}

}
