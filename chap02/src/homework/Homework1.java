package homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게(kg) : ");
		double weight = sc.nextDouble();
		
		System.out.print("키(m) : ");
		double height = sc.nextDouble();
		
		double BMI = weight / (height * height);
		System.out.printf("BMI 지수 : %.1f", BMI);
		
		
		
	}

}
//Homework 주소 : https://devkgn24.notion.site/149fda8bae5780cc9497f6d5d179ac38
//String str = "abcde";
//System.out.println(str.charAt(2)); //문자열 추출하는방법