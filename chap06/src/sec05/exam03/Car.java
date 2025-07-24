package sec05.exam03;

public class Car {
	// 인스턴스 필드
	int speed;
	
	// 인스턴스 메소드
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	// 정적 메소드
	static void test() { // 인스턴스로 쓰고싶으면 static 지우고 밑에 두줄 주석 지우면됨
		
		// 정적 메소드에서는 인스턴스 필드, 인스턴스 메소드, this 키워드 사용 불가 / 3가지 다 객체가 있어야 사용가능
//		speed = 60;
//		run();
		
		// 정적 메소드에서 인스턴스 멤버를 사용하려는 경우
		// 객체를 먼저 생성하고 참조 변수로 접근
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		// 권장하지 않는 이유
		// 왜 굳이 정적 메소드에서 객체를 만들어서 인스턴스 멤버를 쓰는가?
		// 이미 인스턴스 멤버를 사용해야 한다면, 그냥 인스턴스 메소드로 만드는 것이 자연스럽고 명확함
	}
	
	public static void main(String[] args) { //main도 정적메소드 void는 반환하지않음 String의 매개변수로 전달
		test(); // 호출했을때 실행이 잘 된다.
	}
	
	

}
