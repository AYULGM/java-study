package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("기온 : ");
		int temp = sc.nextInt();
		
		if(month == 3 || month == 4 || month == 5) {
			System.out.print("봄");
		}
		else if (month == 6 || month == 7 || month == 8) {
			System.out.print("여름 ");
			if(temp >= 33 && temp < 34) {
				System.out.println("폭염 주의보");
			}
			else if (temp >=35) {
				System.out.println("폭염 경보");
			}
		}
		else if(month == 9 || month == 10 || month == 11) {
			System.out.print("가을");
		}
		else if (month == 12 || month == 1 || month == 2) {
			System.out.print("겨울 ");
			if(temp > -15 && temp <= -12) {
				System.out.println("한파 주의보");
			}
			else if (temp <= -15) {
				System.out.println("한파 경보");
			}
		}
	}

}
