package sec05.exam02;

public class CalculatorExample {

	public static void main(String[] args) {
		// 반지름이 10cm인 원의 넓이 구하기
		
		// 잘못된 접근 방식
//		Calculator calc = new Calculator();
//		double result1 = 10 * 10 * calc.pi; //pi에 커서올려보면 
//The static field Calculator.pi should be accessed in a static way 이라는 오류가뜸
		
		// static 접근 방식
		double result1 = 10 * 10 * Calculator.pi;
//		double result1 = 10 * 10 * Math.PI; // 참고용, Math에서 제공해주는 static 클래스도 있다. 
		System.out.println("result1: " + result1);
		
		int result2 = Calculator.plus(10,5);
		int result3 = Calculator.minus(10,5);
		// 참고: 주로 유틸리티성 기능에 쓰임
		
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
	}

}
