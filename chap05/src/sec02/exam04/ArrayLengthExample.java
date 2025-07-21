package sec02.exam04;

public class ArrayLengthExample {

	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		scores = new int[] {83,90, 87,90}; // length 속성을 쓰면 배열이 변경 됐을 때도 코드 변경이 없음
		
		int sum = 0;
		
//		for (int i = 0; i < 3; i++) { // 여기서 3은 배열 요소의 개수(하드코딩)이므로 배열.length 속성을 활용하면 좋음
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		
//		double avg = sum / 4.0; 이라고 쓸순있겠지만 아래처럼 쓰는게 좋음
		double avg = sum / (double)scores.length; // (double)의 위치는 sum 앞으로 옮겨도됨
		System.out.println("평균: " + avg);
	
		// Quiz
//		총 10명의 학생들의 출석 여부를 표현한 배열 attendance가 있습니다. 
//		학생이 출석한 경우 1, 결석한 경우 0으로 표시되어 있습니다. 
//		출석한 학생의 수를 계산하여 출력해주세요.
		
		int[] attendance = {1, 1, 1, 1, 1, 0, 1, 0, 0, 1};
		
		int students = 0;
		
		for (int i = 0; i < attendance.length; i++) {
			if(attendance[i] == 1) {
//				students += attendance[i]; 출석한경우가 1이어서 가능한 코드인데 아래줄처럼 쓰는게 나을듯
				students ++;
			}
		}
		System.out.println("출석한 학생의 수 : " + students);
		
		
		
		
	}

}
