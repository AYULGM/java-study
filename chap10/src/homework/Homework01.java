package homework;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int answer = (int) (Math.random() * 50) + 1; // 1 ~ 50
		int attempts = 0;
		System.out.println(answer);
		while (true) {
			System.out.print("1~50사이의 숫자 : ");
			String input = scanner.nextLine();

			try {
				int guess = Integer.parseInt(input);
				attempts++;

				if (guess < 1 || guess > 50) {
					System.out.println("1부터 50 사이의 숫자를 입력해주세요.");
					continue;
				}

				if (guess > answer) {
					System.out.println("Down!");
				} else if (guess < answer) {
					System.out.println("Up!");
				} else {
					System.out.println("축하합니다~ 정답이에요");
					System.out.println("총 시도 횟수: " + attempts);
					break;
				}

			} catch (NumberFormatException e) {
				System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
			}
		}

		scanner.close();
	}

}
