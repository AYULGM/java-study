package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("기온 : ");
		int temp = sc.nextInt();
		
		// Early Return 패턴 (실무에서 많이 쓴다는)
        // 에러나 예외 조건을 먼저 검사하고 처리한 다음, 성공 케이스는 마지막에 처리하는 구조
        // 장점: 1) 코드 가독성이 좋아짐 2) 코드의 중첩을 줄일 수 있음
		
		/*
		 if (month < 1 || month > 12) {
        	System.out.println("해당하는 계절이 없습니다.");
        	return; // return을 만나게되면 현재 메소드가 종료 (main 메소드 종료)
        }
		 */
		
		// 선생님이 적은 코드가 더 간결함 / 나는 하드코딩한듯
		if(month == 3 || month == 4 || month == 5) {
			System.out.print("봄");
		}
		else if (month == 6 || month == 7 || month == 8) {
			System.out.print("여름 ");
			if(temp >= 33 && temp < 34) {
				System.out.println("폭염 주의보");
			}
			else if (temp >=35) {
				System.out.println("폭염 경보");
			}
		}
		else if(month == 9 || month == 10 || month == 11) {
			System.out.print("가을");
		}
		else if (month == 12 || month == 1 || month == 2) {
			System.out.print("겨울 ");
			if(temp > -15 && temp <= -12) {
				System.out.println("한파 주의보");
			}
			else if (temp <= -15) {
				System.out.println("한파 경보");
			}
		}
	}

}
