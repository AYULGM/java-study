package homework;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 :");
		char alphabet = sc.nextLine().charAt(0);
		//next중에 char타입은 없기때문에 charAt으로 문자열 A에서 문자A로 바꿔줌 charAt()같은것은 메소드 체이닝이라고 함
		
			
		int unicode = alphabet;
		System.out.println( alphabet + "의 유니코드 : " + unicode );
		
		
		
		
	}

}
//git staging test3