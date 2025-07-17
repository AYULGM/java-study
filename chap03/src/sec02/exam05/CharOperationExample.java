package sec02.exam05;

public class CharOperationExample {

	public static void main(String[] args) {
		// 참고만 할 것! (몰라도 개발하는데 문제없는데 알아두면 좋은 개발상식)
		// 리터럴끼리의 연산은 컴파일 타임에 계산하고 실제 바이트코드에 결과값만 넣음
		char c1 = 'A' + 1; //저장할때마다 컴파일이 되는데 바이트코드(.class)에 이미 65 + 1 == 66이라는 값이 저장이 되는거임. 실행할때는 결과값만 갖고 실행함
						   //리터럴을 더해서 char에 넣는 것은 가능
		// 자바 컴파일러가 컴파일 단계에서 연산
		
		char c2 = 'A';
//		char c3 = c2 + 1; // c2 변수가 int로 형변환 됨(JVM에서 실행 시 연산)
		int i1 = c2 + 1;
		
	}

}
