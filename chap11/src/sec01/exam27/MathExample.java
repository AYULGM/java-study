package sec01.exam27;

import java.util.Scanner;

public class MathExample {

	public static void main(String[] args) {
		// 절댓값
		int v1 = Math.abs(-5); // absolute(절대)
		double v2 = Math.abs(-3.14);
		System.out.println("v1=" + v1);
		System.out.println("v2=" + v2);
		
		// 올림
		double v3 = Math.ceil(5.3); // ceil(천장)
		double v4 = Math.ceil(-5.3); 
		System.out.println("v3=" + v3);
		System.out.println("v4=" + v4);
		
		// 버림(내림)
		double v5 = Math.floor(5.3); // floor(바닥)
		double v6 = Math.floor(-5.3);
		System.out.println("v5=" + v5);
		System.out.println("v6=" + v6);
		
		// 최댓값
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7=" + v7);
		System.out.println("v8=" + v8);

		// 최솟값
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9=" + v9);
		System.out.println("v10=" + v10);
		
		// 랜덤값
		double v11 = Math.random(); // 0.0이상 1.0미만의 랜덤 실수값
		System.out.println("v11=" + v11);
		
		// 가까운 정수의 실숫값
		double v12 = Math.rint(5.3); // rint(풀네임 : round to integer)
		double v13 = Math.rint(5.7); // 챗gpt에 물어보니 짝수.5는 짝수쪽(아래)으로 가더라. 홀수.5는 위로 올라가고 
		System.out.println("v12=" + v12);
		System.out.println("v13=" + v13);

		// 반올림
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println("v14=" + v14);
		System.out.println("v15=" + v15);
		
		// 거듭제곱(n제곱) 강의노트에는 없는 쌤이 따로 알려줌
		System.out.println(Math.pow(10, 2)); // pow에 마우스 갖다대면 double형으로 반환하는걸 알수있음
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.pow(5, 0));
		System.out.println(Math.pow(9, 0.5)); // 루트
		
		// 소수점 이하 특정 자리에서 반올림하기
		// Quiz: 사용자에게 몇째 자리에서 반올림 할지 입력받아 처리
		double value = 12.3456;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇째 자리에서 반올림 할지 고르세요 : ");
		int place = sc.nextInt();
		
		double scale = Math.pow(10, place-1);
		double result = Math.round(value * scale) / scale;
		System.out.println(result);
		
		/* 해봤는데 이게 아닌듯
		switch (place) {
		case '1':
			value = Math.round(value);
			System.out.println(value);
			break;
		case '2':
			value = Math.round(value) * 10;
			System.out.println(value/10);
		case '3':
			value = Math.round(value) * 100;
			System.out.println(value/100);
		case '4':
			value = Math.round(value) * 1000;
			System.out.println(value/1000);
		default: 
			System.out.println("잘못입력");
			break;
		}
		*/
		
	}

}
