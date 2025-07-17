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
		System.out.printf("BMI 지수 : %.1f\n", BMI);
		System.out.println("BMI 지수: " + BMI); // 이렇게 해도되는데 소수점이 많이나옴
		System.out.println("BMI 지수: " + (int) (BMI * 10) / 10.0);// 216->21.6 이렇게 타입변환해도됨
		System.out.println("BMI 지수: " + Math.floor(BMI * 10) / 10.0); // math 메소드를 씀(소수점아래 내림)
	}

}
//Homework 주소 : https://devkgn24.notion.site/149fda8bae5780cc9497f6d5d179ac38
//String str = "abcde";
//System.out.println(str.charAt(2)); //문자열 추출하는방법