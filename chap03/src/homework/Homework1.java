package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("말해보세요 : ");
		String input = sc.nextLine();
		
		String Bird = (input.equals("간다") ? "온다" : "간다" ); // 만약 say가 null이면 에러남
//      String Bird = ("간다".equals(input) ? "온다" : "간다" ); // 이게 더 좋은코드
		// "간다"는 절대 null이 아니라 에러안나고 false로 처리됨 챗지피티는 위에 문장을 권장함
		// 변수 쪽에 equals()를 호출하면, input이 null 일경우 예외(NPE)가 발생할 수 있음
		// 리터럴이나 상수를 앞에 두면, input이 null이어도 안전하게 비교 가능(null-safe)
		System.out.println("앵무새 :" + Bird);

	}

}
// chap03. 연산자 과제
// https://devkgn24.notion.site/14afda8bae578074bad4f9c76f5f50b9
// 연산자만 사용해서 풀 것!(조건문 대신에 삼항(조건) 연산자 사용할 것)