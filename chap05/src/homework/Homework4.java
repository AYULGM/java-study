package homework;

import java.util.Iterator;

public class Homework4 {

	public static void main(String[] args) {
		// 공식화: (int) (Math.random() * (최대값 - 최소값 + 1)) + 최소값;
		 
		int[] lottoArr = new int[6];
		int count = 0;
		
		while (count < 6) {
			int num = (int) (Math.random() * 45) + 1;
			
			// 중복 체크
			boolean dup = false; //중복을 체크하는 변수 듀플리케이트
			for (int i  = 0; i < count; i++) { // 실제 로또 번호가 들어간 count까지만 체크
				if(lottoArr[i] == num) {
					dup = true;
					break; // 중복되는 값을 찾은 즉시 빠져나감
				}
			}
			
			// 중복이 아니면 배열에 저장
			if (!dup) {
				lottoArr[count] = num;
				count ++;
			}
		}
		
		for (int num : lottoArr) {
			System.out.println(num + " ");
		}
			
			
			
			
			
			
			
			
			
	}

}
