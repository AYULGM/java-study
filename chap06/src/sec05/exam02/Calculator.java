package sec05.exam02;

public class Calculator {
	// 정적(static)필드 (=클래스 필드)
	static double pi = 3.141592; // 클래스정보가 메모리에 올라갈때 pi라는 필드가 올라가는거임
	
	//정적(static)메소드 (=클래스 메소드)
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}	
}
