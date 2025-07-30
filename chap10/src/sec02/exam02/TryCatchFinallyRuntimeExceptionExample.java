package sec02.exam02;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0]; // 빈 배열이라 실행 예외 발생
			data2 = args[1];
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			return; // 메소드 종료 (뒤에 있는 코드가 실행되면 안되기때문)_뒤 코드는 실행매개값이 있어야함
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2); //a20" 같이 문자가 섞이면 실행 예외 발생
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);			
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요."); // 예외처리 하든말든 실행됨
		}
	}

}
