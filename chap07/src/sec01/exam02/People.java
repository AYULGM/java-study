package sec01.exam02;

public class People {
	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		System.out.println("부모 객체 생성 완료");
		// 생성자 안에서는 필드만 초기화하는게아니라 추가적인 다른 초기화 코드도 얼마든지 작성될수 있음
	}
}
