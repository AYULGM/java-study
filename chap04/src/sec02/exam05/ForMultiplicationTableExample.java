package sec02.exam05;

public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		// 구구단 출력하기
		// 중첩 for문(여기서는 이중 for문 사용)
		int i,j = 0;
		for (i=2; i<=9 ; i++) {
			System.out.println("*** " + i + "단 ***");
			for(j=1; j<=9 ; j++) {
				System.out.println(i+"*"+j+"="+ (i*j));
			}
			System.out.println(); // 띄어쓰기
		}
		
		// 참고 : for문 중첩 시 퍼포먼스가 떨어짐
		// 삼중을 넘어가면 잘 안씀
		
		
		
	}

}
