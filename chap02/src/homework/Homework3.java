package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 :");
		String str = sc.nextLine(); 
		//next() , nextint()같은건 공백이전까지만 입력받음
		//nextLine()은 공백 포함한 한 라인 전체를 입력받음
		
		System.out.println("첫번째 문자 : " + str.charAt(0)); 
		System.out.println("두번째 문자 : " + str.charAt(1)); 
		System.out.println("세번째 문자 : " + str.charAt(2)); 


	}

}
//git staging test4