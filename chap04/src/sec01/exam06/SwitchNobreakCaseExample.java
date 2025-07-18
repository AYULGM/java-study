package sec01.exam06;

public class SwitchNobreakCaseExample {

	public static void main(String[] args) {
		// 공식화 : (int) (Math.random() * (최대값 - 최소값 +1)) + 최소값;
		// 8 <= ... < 12 사이의 정수 얻기(8~11) 최솟값:8 , 최댓값:11 그래서 밑에 *4인거
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[현재시간: " + time + " 시]");
		
		switch (time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}
		
	}

}
