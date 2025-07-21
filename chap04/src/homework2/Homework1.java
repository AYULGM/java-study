package homework2;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		//Early Return
				/*if (num <= 0) {
		        	System.out.println("양수만 입력해주세요.");
		        	return;
		        }
		        */
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		while(true) {
			System.out.print("정수(1~50) : ");
			int num = sc.nextInt();
		
			if(num<1 || num >50) {
				System.out.println("1~50 사이의 정수를 입력하세요.");
			}
			else {
				for (int i =1;i<=num;i++) {
					if(i%2 == 0) {
					sum +=i;
					}
				}
				System.out.println("합계 : " + sum);
				break;
			}
		}
		
		
		
		
		
		
	}

}

//chap04. 
//2) 반복문 과제
//https://devkgn24.notion.site/14cfda8bae578057991edf04f0f14832
