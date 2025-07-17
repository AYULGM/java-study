package sec02.exam11;

import java.util.Scanner;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 79;
		
		//값이 오는 자리에 연산식이 올 수도 있음
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점은 " + grade + "등급입니다");
		
		// Quiz
//		0~100사이의 점수를 입력받아 삼항(조건) 연산자를 사용하여
//		점수가 60점 이상이면 "합격",
//		60점 미만인 경우 "불합격"을 출력하는 프로그램을 구현하시오.
//		단 음수이거나 100이 넘는 점수는 "점수입력오류"로 출력한다.
//
//		[입력] [출력]
//		 85 => 합격
//		 50 => 불합격
//		-10 => 점수입력오류
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0~100사이의 점수를 입력하세요 : ");
		int Score = sc.nextInt();
		
		String result = (Score >= 60) ? ((Score>100)  ? "점수입력오류" : "합격") : ((Score<0) ? "점수 입력오류" : "불합격");
//선생님이 한거는 String result = (Score < 0 || Score > 100) 
//							  ? "점수입력오류" 
//					     	  : (Score>=60 
//							     ? "합격" 
//				                 : " 불합격");
// 예외조건을 먼저 처리하기위해 조건문을 먼저쓰시고 가독성을 위한 들여쓰기까지 하심		
		System.out.println(Score + "점은 " + result + " 입니다");
		
	}

}
