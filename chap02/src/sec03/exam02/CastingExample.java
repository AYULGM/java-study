package sec03.exam02;

import java.util.Scanner;

public class CastingExample {

	public static void main(String[] args) {
		int intValue = 44032;
//		int intValue = 65601; // 오버플로우: 65601 - 65535 = 66(0부터 세면 65에 해당)
		char charValue = (char) intValue; // char 타입으로 강제 형변환
		System.out.println(charValue);
		
//		long longValue = 500;
		long longValue = 2200000000L; // (테스트) 값의 손실이 일어나는 경우 , 21억을 초과한 22억넣음
		intValue = (int) longValue; // 강제 형변환 시 마지막 4byte만 넣어짐 , 앞에 4byte는 짤리는거임
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue; // 정수 부분만 저장됨
		System.out.println(intValue);
		
		//Quiz
//		long 타입을 입력받아 변수 number에 저장 후 number 변수의 값을
//		int 타입으로 변환한 결과를 출력하시오.
		
		Scanner sc = new Scanner(System.in); //System.in은 키보드로부터 입력받겠다는뜻
		System.out.print("long 타입 입력: ");
		long number = sc.nextLong(); //Long 타입으로 받을거니까 nextLong()을 사용
		
		int result =(int) number;
		System.out.println(result); //result말고 (int)number 그냥 써도됨
		
	}

}
