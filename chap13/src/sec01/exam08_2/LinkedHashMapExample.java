package sec01.exam08_2;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// HashMap
		// 순서를 보장하지 X
		
		// LinkedHashMap
		// 데이터를 저장한 순서를 유지함
		// 순서가 중요한 경우에 사용
		
		Map<String, Object> flower = new LinkedHashMap<String, Object>();
		flower.put("name", "튤립");
		flower.put("lang", "고백");
		flower.put("price", 20000);
		flower.put("day", 10);
		System.out.println(flower); // 순서대로 잘 나옴 ,그냥 HashMap은 뒤죽박죽임
	}

}
