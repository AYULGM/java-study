package sec01.exam07;

public class ExitExample {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
			if ( i == 5) {
				System.exit(0); // 0: 정상 종료일 경우 / exit는 강제적으로 JVM 종료
//				break; // 가장 가까운 반복문을 빠져나감
//				return; // 메소드 종료 (여기선 return문이 포함되어있는 메소드인 main메소드가 종료)
			}
		}
		
		System.out.println("마무리 코드");
	}

}
