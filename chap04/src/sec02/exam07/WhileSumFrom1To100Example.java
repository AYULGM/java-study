package sec02.exam07;

import java.util.Scanner;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		// 1부터 100까지의 합
		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 " + (i-1) + "까지의 합 : " + sum);
		
		// (참고) 무한 루프
		int count = 1;
		while (true) {
			System.out.println("무한 반복" + count);
			
			// 실제 사용 예: 특정 조건을 만족하면 멈추도록
			if (count == 6) {
				break; // 뒤에 문장을 실행하지않고 바로 빠져나옴 (flag=false와의 차이)
			}
			count ++; // 이걸 if문 전에 써놓으면 "무한 반복5"까지밖에 안나옴
		}
		
		count = 1;
		boolean flag = true;
		while (flag) {
			System.out.println("무한 반복" + count);
			
			// 실제 사용 예: 특정 조건을 만족하면 멈추도록
			if (count == 6) {
				flag = false; // 뒤에 문장이 있다면 실행은 하고 다음 반복에서 멈춤 (break과 차이)
			}
			count ++; // 이걸 if문 전에 써놓으면 "무한 반복5"까지밖에 안나옴
		}
		
		//do-while 문으로 작성
		//1부터 100까지의 합
		sum = 0;
		i = 1;
		
		do { // 처음 한번은 무조건 실행
			sum += i;
			i++;
		} while (i <= 100); // 세미콜론 필수!
		
		System.out.println("1부터 " + (i-1) + "까지의 합 : " + sum);
		
		// 최소 한 번은 실행해야 하는 로직에 유용하지만, 실무에서는 거의 사용되지 않음
		
		// Quiz1: 1부터 100까지 홀수의 합
		
		i = 1;
		sum = 0;
		while (i<=100) {
			if(i % 2 != 0) {
			sum = sum + i;
			}
			i++;
		}
		System.out.println("1부터 100까지의 홀수의 합 : " + sum);
		
		// Quiz2:
//		화면에서 자연수를 입력받아서 각 자리수의 합을 출력하는 프로그램을 구현하시오.
//
//		[입력]    [출력]
//		 123   =>  6
//		 12345 =>  15
//				
//		힌트: 
//		1) 마지막 자리 수 더하기
//		2) 마지막 자리 제거
				
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수를 입력하세요 : ");
		int number = sc.nextInt();
		
		sum = 0;
		
		while(number > 0) {
			sum = sum + (number % 10); // 마지막 자리 수 더하기
			number = number / 10; // 마지막 자리 제거
		}
		System.out.println("각 자리수의 합 : " + sum);
				
		
		

		
	}

}
