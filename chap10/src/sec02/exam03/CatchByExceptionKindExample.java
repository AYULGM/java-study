package sec02.exam03;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		// 밑에 있는 코드는 2가지 예외가 발생 가능
		// 하나의 try catch문으로 합치기(다중 catch 사용)

		try {
			String data1 = args[0]; // 빈 배열이라 실행 예외 발생
			String data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2); //a20" 같이 문자가 섞이면 실행 예외 발생
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);	
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
//			return; // 메소드 종료 (뒤에 있는 코드가 실행되면 안되기때문)_뒤 코드는 실행매개값이 있어야함
		} 
//		catch (ArrayIndexOutOfBoundsException | NumberFormatExceptione) {} 
		// (참고) 이렇게 할 수도 있다. 예외상황 2개 다 체크해야하니 | 한개만 씀. ||두개는 앞이 true면 뒤는 평가안하고 넘어가서그럼
		catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요."); // 예외처리 하든말든 실행됨
		}
	}

}
