package sec01.exam04.quiz;

import java.util.Objects;

public class Student {
	
	private int studentNo;
	private String name;
	private String major;

	public Student(int studentNo, String name, String major) { // 생성자만들어주고
		this.studentNo = studentNo;
		this.name = name;
		this.major = major;
	}
/*// 자동완성 없이 손수 쓴거
	@Override
	public boolean equals(Object obj) { // 같은학생이라고 나오게끔 equals 재정의 해줘야함
		if (this == obj) return true; // 같은 참조이면 true
		// 교재에 있는 중첩 if문을 피하려면 Early Return 방식을 써야함 (실무에서 많이씀) 코드의 가독성도 좋아짐
		if (!(obj instanceof Student)) return false; //만약 obj로 들어온 객체가 Student 타입이 아니면
		// student타입이 맞다면 필드끼리 비교
		// Object 타입에서 Student타입으로 바꿔줌
		Student other = (Student) obj;
		return this.studentNo == other.studentNo && this.name.equals(other.name); // 두 객체의 studentNo가 같다면 true
		//this를 쓸때는 매개변수랑 필드값이랑 충돌날때 쓰는데 여기선 굳이 안써도됨. 의미를 좀더 명확하게 해주는거뿐
	}

	// 동등 객체를 판단할 때
	// equals()를 오버라이딩(재정의)하면 hashCode()도 함께 오버라이딩하는 것이 일반적 (재정의 set)
	@Override
	public int hashCode() {
		return Objects.hash(studentNo, name); // 학번과 이름을 넘기면 같은 해쉬코드가 나오게끔
	}

*/
	
	@Override
	public String toString() {
		return "[studentNo=" + studentNo + ", name=" + name + ", major=" + major + "]";
	}
//여기서부턴 자동완성씀
	@Override
	public int hashCode() {
		return Objects.hash(name, studentNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && studentNo == other.studentNo;
	}

}
