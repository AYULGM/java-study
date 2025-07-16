package homework;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 : ");
		Double korean = sc.nextDouble();

		System.out.print("영어 : ");
		Double english = sc.nextDouble();

		System.out.print("수학 : ");
		Double math = sc.nextDouble();

		int total = (int) (korean + english + math);
		int average = total / 3;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);

	}

}
//git staging test2