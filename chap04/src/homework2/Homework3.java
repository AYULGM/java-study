package homework2;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("입력 : ");
			String input = sc.nextLine();
			
			if ("탈출".equals(input)) {
				System.out.println("프로그램 종료");
			}
			else {
				System.out.println(input);
				continue;
			}
			
			break;
		}
	}

} 

//나중에 답과 비교해보자
