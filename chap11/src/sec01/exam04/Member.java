package sec01.exam04;

import java.util.Objects;

public class Member { //exam02에 있는 Member클래스 복붙해옴
	public String id;

	// 생성자
	public Member(String id) {
		this.id = id;
	}
	
	@Override
		public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
		}
	
//	@Override
//		public int hashCode() {
//		// id가 같은 모든 Member 객체는 동일한 해시코드가 나오게 만들어줌
//		return id.hashCode(); // String은 문자열이 같으면 동일한 해시코드가 나오도록 재정의 되어있음
//		}
	
	// 아까 알려준 더 나은 방식
	@Override
		public int hashCode() {	
		return Objects.hash(id);
		}
}
