package sec02.exam10;

import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		// 짝수만 출력
		for (int i=0;i<=10;i++) {
			if(i%2 !=0) {
				continue; // 다음 반복으로 건너뛰어라
			}
			System.out.println(i);
		}
		// Quiz
//		철수는 여자친구 영희에게 생일 축하 메시지를 보내려고 해요. 
//		그런데 철수의 여자친구 영희는 띄어쓰기를 싫어합니다.
//		철수가 어떤 문자열을 입력하든 영희에게 혼나지 않게
//		글자 사이에 있는 띄어쓰기가 없게 출력해주세요.
//		
//		힌트: 
//		- 문자열의 길이를 측정할때는 length()를 사용, 예: str.length()
//		- 반복문을 활용하여 공백을 만날 경우 다음 반복 회차로 넘어가세요.
//		
//		[입력]
//		영희야 생 일 축 하 해 !
//		
//		[출력]
//		영희야생일축하해!
		System.out.println("\n-------Quiz-------\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메시지를 보내주세요 : ");
		String message = sc.nextLine();
// 여기서부터 고민하다 몰라서 gpt 돌림
		   String result = ""; // 공백 제거된 문자열 저장할 변수

	        for (int i = 0; i < message.length(); i++) {
	            char ch = message.charAt(i); // 입력받은 message 문자열에서 문자 하나씩 읽음
	            // 다시풀때 나는 실수로 char ch = sc.nextLine().charAt(i) 했는데 gpt에 물어보니
	            // 반복문 돌 때마다 새로 입력을 기다림 / 즉, 루프 돌 때마다 입력창 뜸
	            // 사용자가 5글자 입력했다면, for문은 5번 다시 입력을 요구함 → 매우 이상한 동작
	            if (ch == ' ') {
	                continue; // 공백이면 건너뛰기
	            }
	            result += ch; // 공백이 아니면 추가
	        }
	        System.out.println(result);

		
	}

}
