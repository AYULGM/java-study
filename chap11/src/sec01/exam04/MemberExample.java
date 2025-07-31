package sec01.exam04;

import java.util.HashMap;

public class MemberExample {
	
	public static void main(String[] args) {
		HashMap<Member, String> hashMap = new HashMap<Member, String>();
		
		hashMap.put(new Member("fall"), "value1");
		hashMap.put(new Member("winter"), "value2");
		hashMap.put(new Member("fall"), "value3"); //키가 중복이 안되서 value1을 지워버림 즉, 키인 "fall"을 서로다른키로 인식했다는뜻
		//그래서 해시코드 재정의를 해줘야함
		// 첫번째 멤버 객체와 동등 객체로 판단하고 키가 동일하므로 값을 덮어 씌움 (3이었는데 2로 줄음)
		
		System.out.println(hashMap.size());
	}
}
