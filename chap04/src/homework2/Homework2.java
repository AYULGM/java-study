package homework2;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		while(true) {
			System.out.print("숫자(1~9) : ");
			int num = sc.nextInt();
			
			if (num < 0) {
				System.out.println("양수만 입력해주세요.");
				continue;
			}
			else if (num == 0) {
		    	System.out.println("프로그램 종료");
		    	break;
		    }
			else if (num > 9) {
				System.out.println("9 이하의 숫자를 입력해주세요.");
				continue;
			}
			else {
				for (int i=num;i<=9;i++) {
					System.out.println("=== " + i + "단 ===");
					for(int j=1;j<=9;j++) {
						System.out.println(i + " * " + j + " = " +i*j);
					}
					
				}
				
			}
		
		
		}
		
		
		
		
		
		
		
	}

}
