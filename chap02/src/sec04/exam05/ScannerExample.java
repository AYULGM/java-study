package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputData,inputData2;
		
		while(true) {
			inputData = sc.nextInt(); // 스캐너에서 읽은 한 줄 전체(엔터키 이전까지)
			inputData2 = sc.nextInt(); // Scanner 클래스는 사용자의 입력을 다양한 타입으로 자동 변환해주는 편리한 기능(메소드)를 제공
			System.out.println("입력된 문자열: " + inputData+ "," + inputData2); // int + 문자열 + int 이므로 문자열로 결합됨
			
			if(inputData == 99 ||inputData2 == 99 ) {
				break;
			}
	}
		System.out.println("종료\n");
		// Quiz
//		2개의 int 값을 입력받아 입력받은 값을 화면에 ,로 연결하여 출력하시오.
//		[입력]    [출력]
//		10 20 => 10,20
		
//			if(inputData == "q") 라고 쓰면 안됨. 입력된 문자열과 메모리주소가 다르기 때문에

// 주의!
// nextInt()나 next()는 입력 후 개행 문자(\n)를 버퍼에 남김
// 따라서 그 다음에 nextLine()을 쓰면 개행을 읽어버려서 빈 문자열()이 들어감
// 그래서 실행해보면 엔터가 버퍼에 걸려있어서 name을 쓸 수가 없음
// 해결법 : 중간에 sc.nextLine()을 한 번 호출해 버퍼를 정리
		
		int age = sc.nextInt(); // 25 입력 + 엔터 하면 딱 정수값만 가져옴
		sc.nextLine(); // 버퍼 비우기 (중요!)
		String name = sc.nextLine(); // 정상 입력 가능
		System.out.println("name: " + name);
}
}
		
		
	