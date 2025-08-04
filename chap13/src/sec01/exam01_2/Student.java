package sec01.exam01_2;

import java.util.Objects;

// Comparable
// 자바에서 객체 간의 "기본 정렬 순서"를 정의하기 위해 사용되는 인터페이스
// 객체를 정렬할 수 있도록 비교 기준을 정의
public class Student implements Comparable<Student> { // Student클래스 안에 Comparable을 재정의 해줘야함. String이나 Integer에 있는거처럼.
	private String name;
	private int age;
	
	
	public Student() {
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
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
		return age == other.age && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student other) {
		// 중요! compareTo()의 리턴값 의미(오름차순을 기준으로 함)
		// 두 수를 비교해서 뺀 결과가 (정렬 알고리즘은 다양하게 할수있다)
		// 음수: this < other - this가 앞에 온다
		// 양수: this > other - this가 뒤에 온다
		// 0: this == other - 순서 유지
		// 즉, 양수이면 자리를 바꿔주고 음수 또는 0이면 자리를 바꾸지 않음
		
		// 나이 오름차순
		return age - other.age;
		
		// 나이 내림차순
		// 오름차순 결과의 반대로 구현. 즉, other의 값이 클 때 자리 바꿈
//		return other.age - age; // (age 에는  this가 생략됨)
		
		// 나이 오름차순을 비교 연산으로 구현 시
//		if (age < other.age) return -1; //-1이든 -100이든 상관없음 관례라 -1적은거임
//		else if (age > other.age) return 1; // 양수를 리턴
//		else return 0; // 둘의 나이가 같다는 얘기니까 0을 리턴
		
		// 문자열은 연산자로 비교 불가능 ( "가" < "나" ) 이런거 못한다는거임
		// String 클래스에 재정의된 compareTo() 사용
		// 기준 문자열이 사전상 뒤면 자리 바꿈
		// 기준 문자열이 사전상 앞이면 그대로 유지
		
//		"김재현".compareTo("박민수"); -> 음수를 리턴 -> 그대로 유지
//		return name.compareTo(other.name); // 오름차순
//		return other.name.compareTo(name); // 내림차순
	}
	
}
