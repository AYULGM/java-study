package sec02.exam02.quiz;

public class Calculator {
	public int add(int num1,int num2) {
		return num1+num2;
	}
	public int multiple(int num1,int num2) {
		return num1*num2;
	}
	public int divide(int num1,int num2) {
		return num1/num2;
	}
}
//Calculator 클래스 안에는 두 개의 정수형 숫자를 매개변수로 사용하는 메소드가 3개 있습니다.
//각 메소드의 명칭과 리턴은 다음과 같습니다.
//(return 하는 값은 전부 int 타입)
//  - add: 두 수 더하기
//  - multiple: 두 수 곱하기
//  - divide: 두 수 나누기 몫