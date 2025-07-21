package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		int fee;
		if(age < 3) {
			System.out.println("당신의 놀이동산 요금은 0원입니다.");
			fee = 0;
		}
		else if (age <= 12) { //age >=3 && age <= 12 보다는 그냥 age<=12라 적는게 나을듯

			fee = 10000;
		}
		else if (age <= 18) {

			fee = 20000;
		}
		else if (age <= 64) {

			fee = 30000;
		}
		else {

			fee = 0;
		}
		
		System.out.println("당신의 놀이동산 요금은 " + fee +"원입니다.");
		

	}

}

/*
chap04. 
1) 조건문 과제
https://devkgn24.notion.site/14bfda8bae5780a192eddf35bfe9f3fe
3번 문제: 삼항 연산자 대신 조건문 사용할 것
6번 문제: 과락 과목이 여러 개일 경우 입력한 순서에서 제일 첫번째 과락 과목만 출력
*/