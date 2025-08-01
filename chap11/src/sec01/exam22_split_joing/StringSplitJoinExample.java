package sec01.exam22_split_joing;

public class StringSplitJoinExample {

	public static void main(String[] args) {
		// split() 은 쪼개다라는 뜻
		// 문자열을 배열로 나누기
		// 문자열을 특정 구분자로 나눠서 문자열 배열로 반환
		// 구분자를 기준으로 각 요소를 개별적으로 처리하고 싶을 때 사용
		String str = "봄-여름-가을-겨울";
		String[] seasons = str.split("-"); // - 구분자를 기준으로 배열로 자름 , 저번 퀴즈에 했던 toCharArray랑 다름
		
		for (String season : seasons) {
			System.out.println(season);
		}
		
		// join() 은 반대임
		// 문자열 배열을 하나의 문자열로 결합
		// 배열이나 리스트 등의 문자열 요소를 하나의 문자열로 합칠 때 사용
		// 각 요소 사이에 지정한 구분자를 넣음
		
		// join은 static 클래스 안에 들어있음
		String joined = String.join("->", seasons);
		System.out.println(joined);
	}

}
