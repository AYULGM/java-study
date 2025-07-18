package sec02.exam03;

import java.util.Scanner;

public class ForSumFrom1To100Example2 {

	public static void main(String[] args) {
		
		// 1부터 100까지의 합
		int sum=0; // 0을 넣지않으면 sum 이라는 변수 생성이 X
		
		int i;
		
		for(i=1;i<=100;i++) {
			sum = sum + i;
		 // sum += i; 는 개인 취향
		}
		
		// i는 for문 내부에서만 사용 가능한 지역변수라 for문이 끝나면 소멸
		System.out.println("1부터 " + (i-1) +" 합: " + sum);
		
		/*
		
		// (참고) 무한 루프 , while문이 조금 더 가독성이 있긴함
		int count = 0;
		for (;;) { // 다 없거나 하나만 적거나 두개만적거나 
			System.out.println("무한 반복");
			count++;
			
			// 실제 사용 예: 특정 조건을 만족하면 멈추도록
			if (count == 6) {
				break;
			}
		}
		
		*/
		
		// Quiz1: 1부터 100까지 짝수의 합
		int total = 0;
		for (int j=1;j<=100;j++) {
			if(j%2 == 0) {
			total = total + j;
			}
		}
		System.out.println("1부터 100까지 짝수의 합 : " + total );
		
		
		
		// Quiz2: 
//		숫자를 입력받아 입력받은 수가 
//		짝수인 경우: 2부터 해당 숫자까지 짝수의 합
//		홀수인 경우: 1부터 해당 숫자까지 홀수의 합
//		을 구하는 프로그램을 구현하시오
//
//		[입력]  [출력]
//		 10  => 30
//		 11  => 36
	

		Scanner sc = new Scanner(System.in);
		System.out.print("홀수나 짝수를 입력하세요 : ");
		int input = sc.nextInt();
		int total2 = 0;
		
		if(input%2 == 0) { // 짝수인경우
			for(i=2;i<=input;i=i+2) {
				total2 = total2 + i;
			}
			System.out.println("2부터 " + input + "까지 짝수의 합 : " + total2);
		}
		else { // 홀수인경우
			for(i=1;i<=input;i=i+2) {
				total2 = total2 + i;
			}
			System.out.println("1부터 " + input + "까지 홀수의 합 : " + total2);
		}
		
	}

}
