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
		double average = total / 3.0; // 소숫점 결과를 얻고 싶다면 double로 바꿔주고
		//나누는 것중 하나를 double형인 3.0으로 바꿈
		System.out.println("합계: " + total + "점");
		System.out.println("평균: " + average + "점");
		
		String parentsSay = (korean >= 60) && (math >= 60) && (english >= 60) && (average >90) 
							? "휴대폰을 바꿀 수 있습니다" 
							: "휴대폰을 바꿀 수 없습니다" ;
		//쌤은 ~~~ ? true : false ; 로 적으심 밑에 syso가 있는데 삼항연산자에서 쓰는듯
		
		System.out.println(parentsSay);
		// 250717_23:18에 쌤 깃허브 보고있는데 쌤은 
		//boolean canChangePhone = (korean >= 60 && math >= 60 && english >= 60 && avg > 90) ?
	    		//true : false;
//		System.out.println(canChangePhone ? "휴대폰을 바꿀 수 있습니다." : "휴대폰을 바꿀 수 없습니다.");
		// 이런식으로 boolean으로 true,false얻어내고 syso 에다 삼항연산자를 걸어버림
	}

}
