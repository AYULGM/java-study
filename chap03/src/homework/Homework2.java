package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구슬의 개수 : ");
		int bead = sc.nextInt();
		
		String beadNumber = ((bead%2==0)? " 짝수입니다" : " 홀수입니다" );
		System.out.println("구슬의 개수는" + beadNumber);
	}

}
