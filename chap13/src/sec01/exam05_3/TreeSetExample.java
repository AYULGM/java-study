package sec01.exam05_3;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample { // TreeSet과 LinkedHashSet는 개발하면서 쓸일이 거의없어 차이점만 알아두기

	public static void main(String[] args) {
		// TreeSet
		// 데이터를 오름차순으로 자동 정렬
		// 저장한 순서 그대로는 보장하지 않음
		// "정렬된 순서"를 보장
//		Set<String> set = new TreeSet<String>();
		// 내림차순으로 정렬하고 싶다면 TreeSet 생성자에 Comparator를 매개값으로 전달
		Set<String> set = new TreeSet<String>(Collections.reverseOrder());

		
		set.add("동");
		set.add("서");
		set.add("남");
		set.add("북");
		System.out.println(set);
	}
//git test
}
