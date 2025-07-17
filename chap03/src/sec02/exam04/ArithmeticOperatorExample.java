package sec02.exam04;

import java.util.Scanner;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1=" + result1);
		
		int result2 = v1 - v2;
		System.out.println("result2=" + result2);
		
		int result3 = v1 * v2;
		System.out.println("result3=" + result3);
		
		int result4 = v1 / v2;
		System.out.println("result4=" + result4);
		
		int result5 = v1 % v2;
		System.out.println("result5=" + result5);
		// 나머지 연산은 주로 짝/홀 판별할때 또는 배수를 확인할 때 사용
		// ex) 9%3 == 0 이 나오면 9는 3의배수 라는 뜻

		//정확한 나누기 결과값을 얻으려면 애초에 double 변수로 선언하던가 아니면 타입변환을 통해 가능
		double result6 = (double) v1 / v2; //둘 중 하나를 형변환하거나 둘다 형변환하던가 맘대로 
		System.out.println("result6=" + result6);
		
	// Quiz
//		화면에서 2자리 정수를 입력받아 10의 자리 미만을 버리고
//		출력하는 프로그램을 구현하시오
//
//		[입력] [출력]
//		 55 => 50
//		 60 => 60
		
		int input;
		System.out.print("입력 : " );
		input = sc.nextInt();
		input = input / 10 * 10;
		//input = input - (input % 10); // 방법2. 본인 숫자에서 본인의 나머지인 일의자리숫자를 빼는 것 //답은 여러가지로 나올수있음
		System.out.println("출력 : " + input);
		
	}

}
