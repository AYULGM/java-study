package homework;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		System.out.print("국어 : ");
		int english = sc.nextInt();
		
		int total = korean+math+english;
		int average = total / 3;
		System.out.println("합계: " + total + "점");
		System.out.println("평균: " + average + "점");
		
		String parentsSay = (korean >= 60) && (math >= 60) && (english >= 60) && (average >=90) 
							? "휴대폰을 바꿀 수 있습니다" 
							: "휴대폰을 바꿀 수 없습니다" ;

		System.out.println(parentsSay);
	}

}
