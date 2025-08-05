package sec01.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>(); // 자동완성하면 임포트가 자동으로 생성이돼서 빠름
		List<String> list2 = new LinkedList<String>(); 
		
		long startTime;
		long endTime;
		
		// 인덱스 0번에 10000개의 데이터를 삽입하여 시간 측정
		startTime = System.nanoTime();
		for (int i = 0; i <10000; i++) {
			list1.add(0, String.valueOf(i)); // 기본타입값을 문자열로 바꾸는 String.valueOf
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime - startTime) + " ns");
		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime - startTime) + "ns");
	}

}
