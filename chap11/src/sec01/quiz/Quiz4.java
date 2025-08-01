package sec01.quiz;

import java.util.Scanner;

public class Quiz4 {
//	Quiz
//	반 전체 학생이 몇 명인지 입력을 받아 배열을 만들고,
//	우리반 학생들 이름을 입력받아서 모두의 이름을 배열에 추가합니다.
//	전체 학생 중에서 오늘 커피 쏠 사람을 랜덤으로 뽑으려고 해요.
//	Math.random()을 활용해서 학생 한 명을 추출하여 출력하세요.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("반 전체 학생이 몇 명인지: ");
		int input = sc.nextInt();

		sc.nextLine();

		String[] student = new String[input];

		System.out.println("학생은 " + input + " 명입니다.");
		for (int i = 0; i < student.length; i++) {
			System.out.print((i + 1) + "번째 학생의 이름을 입력하세요 : ");

			student[i] = sc.nextLine();
		}
		String Choice = student[(int) (Math.random() * student.length)];

		System.out.println("커피 쏠 사람은: " + Choice);
	}

}
