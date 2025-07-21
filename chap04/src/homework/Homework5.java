package homework;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. 스쿼트\r\n"
						 + "2. 데드리프트\r\n"
						 + "3. 벤치 프레스\r\n"
						 + "4. 풀업\r\n"
						 + "5. 종료" );
		System.out.print("(1~5) 중에 하나를 선택해주세요 : ");
		int num = sc.nextInt();
		
		
		//Early Return
		/*if (num <= 0) {
        	System.out.println("양수만 입력해주세요.");
        	return;
        }
		*/ // 다음부터 early return 하는 습관 들여야할듯
		
		if(num == 1) {
			System.out.println("스쿼트 운동 시간입니다.");
		}
		else if ( num == 2) {
			System.out.println("데드리프트 운동 시간입니다.");
		}
		else if ( num == 3) {
			System.out.println("벤치 프레스 운동 시간입니다.");
		}
		else if ( num == 4) {
			System.out.println("풀업 운동 시간입니다.");
		}
		else if ( num == 5) {
			System.out.println("오늘도 수고하셨습니다.");
		}
		else if (num <= 0) {
			System.out.println("양수만 입력해주세요.");
		}
		else {
			System.out.println("목록에 있는 숫자만 입력해주세요.");
		}
	}

}
