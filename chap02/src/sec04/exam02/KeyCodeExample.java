package sec04.exam02;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception { // 발생한 예외를 모니터(콘솔)에 출력하고 끝내라

		int keyCode;
		
		// 키보드로부터 키코드를 읽어올 때 예외가 발생할 수 있음 -> 예외처리는 뒤에서 배움
		keyCode = System.in.read(); // 콘솔에서 키보드로부터 입력을 받을 때까지 기다림(입력이 없으면 멈춰있음)
		//System.in.read(): 인터넷에서 찾은건데 키보드의 키 코드를 읽는 명령어
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
	}

}
