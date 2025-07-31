package sec01.exam02;

public class Member { // 명시적으로 상속받은게 없으면 자동으로 Object를 상속 받음
	public String id;

	// 생성자
	public Member(String id) {
		this.id = id;
	}
	
	@Override
		public boolean equals(Object obj) {
			// 매개 변수의 타입이 Object 타입이라 모든 객체가 대입 가능하므로 (Member객체든 쌩뚱맞은 Car객체든 다들어올수있어서)
			// 제일 먼저 매개값이 Member 타입인지 확인이 필요
		if (obj instanceof Member) { // obj가 Member타입이 맞는지 확인
			// 이게 true이려면  obj객체가 Member타입이거나 그 이하(서브클래스)여야함
			// 왼쪽은 객체 , 오른쪽은 타입 / 타입비교하는게아님
			// id 필드에 접근하기 위해 Member 타입으로 강제 타입 변환하고
			Member member = (Member) obj;
			// id 필드값이 동일한지 검사
			if(id.equals(member.id)) { // 여기서의 equals()는 String에 재정의 된 메소드로 문자열을 비교
				return true;
			}
		}
		// 매개값이 Member 타입이 아니거나
		// id 필드값이 다른 경우 false를 리턴
		return false;
		}

}
