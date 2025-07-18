package sec02.exam02;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		// 1부터 100까지의 합
		int sum=0; // 0을 넣지않으면 sum 이라는 변수 생성이 X
		
		for(int i=1;i<=100;i++) {
			sum = sum + i;
		 // sum += i; 는 개인 취향
		}
		
		// i는 for문 내부에서만 사용 가능한 지역변수라 for문이 끝나면 소멸
		System.out.println("1부터 100까지의 합 : " + sum);
	}

}
