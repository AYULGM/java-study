package sec01.quiz;

import java.util.Scanner;

public class Quiz3 {
//	Quiz
//	원본 문자열과 찾는 문자열을 입력 받아 개수를 출력하는 프로그램을 구현하기 위해 
//	실행 클래스의 count 메서드를 작성하시오.
//	count(원본문자열, 찾는문자열) 메서드는 원본 문자열에서 찾는 문자열의 개수를 리턴하는 메소드입니다.
//	※ 참고: 정적(static) 메소드 안에서 인스턴스 메소드를 쓸 수 없습니다.
//
//	[입력]
//	1) 123AB123 AB
//	2) 123AB123 13
//	3) 123AB123AB12 AB
//	
//	[출력]
//	1) 1
//	2) 0
//  3) 2
//	
//  [힌트]
//	indexOf(String str, int fromIndex)를 이용해 반복해서 찾기
//  fromIndex: 검색 시작 위치 지정

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("원본 문자열 입력: ");
		String str1 = sc.nextLine();

		System.out.print("찾는 문자열 입력: ");
		String str2 = sc.nextLine();

		System.out.println(count(str1, str2));

	}

	private static int count(String original, String target) {

		int count = 0;
		int index = 0;
		// 아래에 있는 3개 다 같은코드
		
		// indexof를 이용해 반복해서 찾기
		index = original.indexOf(target);
		while (index != -1) { // 찾으면  (못찾으면 -1을 반환하니까 !을 붙여주면 찾았다는뜻)
			count ++;
			index = index + target.length(); // 다음 검색 위치 (index 3에서 길이2개짜리 찾으면 5부터 시작인거임) index엔 5가 저장됨
			index = original.indexOf(target, index); // 다음 위치에서 다시 검색 (타겟문자열을 찾는데 , 5부터 검색을해라) 이러면 7이 나오겠지
		}
		
		// 축약형: indexOf를 한 번만 쓰기 (위에 있는코드를 줄인거임)
				while ((index = original.indexOf(target, index)) != -1) {
					count++;
					index += target.length(); // 다음 검색 위치로 이동
				}
				
		// 무한 반복문 사용 시
				while (true) {
					index = original.indexOf(target, index);
					if(index == -1) break;
					count++;
					index += target.length(); // 다음 검색 위치로 이동
				}
		
				
				return count;
			}
}
