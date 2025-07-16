package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		double area = width*height;
		double circumference = (width+height)*2;
		
		System.out.printf("면적 : %.2f\n",area);
		System.out.printf("둘레 : %.1f",circumference);
		
	}

}
