package sec01.exam01;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String data = null; // stack에 null이 들어가있지만 heap에 어떠한 객체도 참조하지않음 
							// null로 초기화 시 참조하는 객체가 없음
		System.out.println(data.toString()); // 객체에 접근 -> 접근할 객체가 없음
		// NPE(NullPointerException) 발생 시 .을 찾아서 참조 변수가 객체를 참조하고 있는지 확인
		// 실행 예외의 경우 컴파일은 가능 (예외가 실행 중에 발생하기 때문)
	}

}
