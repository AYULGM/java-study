package sec01.exam02;

public class Student extends People {
	public int studentNo; // 학번

	public Student(String name, String ssn, int studentNo) {
//		super(); //이걸 생략하고 실행하면 컴파일 오류남
		super(name, ssn); // 이렇게 일반적으로 부모에서 내려온 name, ssn은 부모가 초기화
		// 부모 클래스가 책임지는 초기화는 부모 생성자에게 맡기는 게 원칙적이고 안전한 방법임
		// 만약 부모쪽에 다른 초기화 코드가 있으면 못볼수있으니..
		this.studentNo = studentNo;
		System.out.println("자식 객체 생성 완료");
	}
	
	
}
