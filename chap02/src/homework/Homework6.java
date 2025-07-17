package homework;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한 자리 숫자를 입력하세요 : ");
		char number = sc.nextLine().charAt(0);
		// 문자 '5' -> 숫자 5 로 변환 , 문자'0'은 유니코드값이 48이라 '5'-'0' = 53 -48 = 5
		// 수업시간때 배운 char 타입의 숫자형 문자를 정수로 변환하여 계산도 윗줄이랑 똑같음
		int digit = number - '0'; 
		//JAVA에서 연산 시 int 이하의 타입은 전부 int로 자동 형변환된다고 배움 (그래서 digit의 타입을 int로 한것)
		int squared = digit*digit;
		
		System.out.printf("입력한 숫자의 제곱은 %d입니다.\n", squared);
		System.out.println("입력한 숫자의 제곱은 " + squared + "입니다.");
	}

}
//git staging test