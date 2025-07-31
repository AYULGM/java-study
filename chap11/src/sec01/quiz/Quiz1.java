package sec01.quiz;

import java.util.Scanner;

public class Quiz1 {
//	Quiz
//	문자열을 입력 받아 입력된 문자열 중 숫자들의 합계를 출력하시오.
//
//	[입력]
//	1) 1,2,3,4,5
//	2) 1-2-3-4-5
//	3) a1b2c3de45
//
//	[출력]
//	1) 15
//	2) 15
//	3) 15

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		int sum = 0;
		
	
			
			for(int i=0; i < str.length();i++) {
				char ch = str.charAt(i);
				if (ch >= '0' && ch <= '9' ) { // 48보단 '0' 이라 해주는게 가독성이 좋음
					sum += (ch - '0');
				}
			}
			System.out.println("sum1의 합계: " + sum);
			
			
			
			
			// 자바에서 제공하는 메소드를 사용한 편리한 방법 (책에 없는 메소드들 썜이 알려줌) 위에 적혀있는거랑 동일한 결과를 가지는 코드
			int sum2 = 0;
			// 문자열을 char 배열로 변환하는 메소드
			
			for (char ch : str.toCharArray()) { //for-each문 , // 캐릭터형 배열로 바꿔줌
				// 문자가 숫자인지 판별하는 메소드
				if(Character.isDigit(ch)) { // 하나의 문자가 숫자가 맞냐? 맞으면 true
					sum2 += Character.getNumericValue(ch); // 문자를 정수로 변환하는 메소드
				}
			}
			System.out.println("sum2의 합계: " + sum2);
			
			
		}

	}

