package sec02.verify.exam09;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		Double num1 = sc.nextDouble();
		
		System.out.print("두 번째 수: ");
		Double num2 = sc.nextDouble();
		
		
		
		System.out.println("----------");
		
		if((num2 == 0)||(num2 == 0.0)) {
			System.out.println("결과:무한대");
		}
		else {
		System.out.println("결과:" + num1/num2);
		}
	}

} // 정답지 : https://dw.hanbit.co.kr/exam/10187/answer.pdf
