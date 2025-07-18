package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if(age > 0 && age < 3) {
			System.out.println("당신의 놀이동산 요금은 0원입니다.");
		}
		else if (age >=3 && age <= 12) {
			System.out.println("당신의 놀이동산 요금은 10000원입니다.");
		}
		else if (age >=13 && age <= 18) {
			System.out.println("당신의 놀이동산 요금은 20000원입니다.");
		}
		else if (age >=19 && age <= 64) {
			System.out.println("당신의 놀이동산 요금은 30000원입니다.");
		}
		else {
			System.out.println("당신의 놀이동산 요금은 0원입니다.");
		}
		

	}

}

/*
chap04. 
1) 조건문 과제
https://devkgn24.notion.site/14bfda8bae5780a192eddf35bfe9f3fe
3번 문제: 삼항 연산자 대신 조건문 사용할 것
6번 문제: 과락 과목이 여러 개일 경우 입력한 순서에서 제일 첫번째 과락 과목만 출력
*/