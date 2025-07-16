package homework;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한 자리 숫자를 입력하세요 :");
		char number = sc.nextLine().charAt(0);
		// 문자 '5' -> 숫자 5 로 변환 , 문자'0'은 유니코드값이 48이라 '5'-'0' = 53 -48 = 5
		int digit = number - '0'; 
		int squared = digit*digit;
		
		System.out.printf("입력한 숫자의 제곱은 %d 입니다.", squared);
	}

}
//git staging test