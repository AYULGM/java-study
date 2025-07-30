package sec02.exam02.quiz;

public class Quiz2 {

	public static void main(String[] args) {
		// Quiz: 실행 흐름 예측해보기
		// 어떤 순서로 출력될지 예측해서 번호를 적어보세요.
		
		// 1. 예외가 발생하지 않은 경우
		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		} catch (Exception e) {
			System.out.println(4);
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
		// 정답: 1 2 3 5 6
		
		System.out.println("=====");
		
		// 2. 예외가 발생한 경우
		System.out.println(1);
		try {
			System.out.println(2);
			
			System.out.println(0/0); 
			// 예외 발생 => 발생한 예외를 받아줄 수 있는 catch 블럭이 있는지 확인 => 있으면 예외 처리됨
			System.out.println(3);
		} catch (ArithmeticException ae) { // 받아줄 수 있음 (예외 처리 가능하다는 뜻)
			System.out.println(4);
		} finally {
			System.out.println(5);
		}
		System.out.println(6);
		// 정답: 1 2 4 5 6
		
		System.out.println("=====");
		
		// 3. 예외가 발생한 경우
		System.out.println(1);
		try {
			System.out.println(2);
			
			System.out.println(args[0]);
			// 예외 발생 => 발생한 예외와 일치하는 catch 블럭을 찾지 못하면 예외는 처리되지 못함 => 비정상 종료

			System.out.println(3);
		} catch (ArithmeticException e) { // 엉뚱한 예외처리 (예외처리 종류가 달라서 catch에서 못 잡음)
			System.out.println(4);
		} finally {
			System.out.println(5);
		}
		System.out.println(6); // try-catch문에서 예외처리를 수행하지 못해서 그 다음줄은 실행불가
		// 정답: 1 2 5 (비정상 종료)
	}

}
