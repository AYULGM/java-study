package homework;

import java.util.Scanner;

public class Homework6 {
//6번 문제: 과락 과목이 여러 개일 경우 입력한 순서에서 제일 첫번째 과락 과목만 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("각 과목의 점수를 입력하세요.");
		System.out.print("소프트웨어설계 점수: ");
		int s1 = sc.nextInt();
		System.out.print("소프트웨어개발 점수: ");
		int s2 = sc.nextInt();
		System.out.print("데이터베이스구축 점수: ");
		int d3 = sc.nextInt();
		System.out.print("프로그래밍언어활용 점수: ");
		int p4 = sc.nextInt();
		System.out.print("정보시스템구축관리 점수: ");
		int i5 = sc.nextInt();
		
			
		
		int total = s1+s2+d3+p4+i5;
		double average = total / 5.0; // 이것도 5말고 5.0으로 해야 소숫점 아래값이 안짤리는데 실수함
		System.out.println("average = " + average);
		
		/* 선생님이 쓴 답 
		 * if (design < 40) {
        	System.out.println("소프트웨어설계 과목 과락으로 불합격입니다.");
        } else if (dev < 40) {
            System.out.println("소프트웨어개발 과목 과락으로 불합격입니다.");
        } else if (db < 40) {
            System.out.println("데이터베이스구축 과목 과락으로 불합격입니다.");
        } else if (lang < 40) {
            System.out.println("프로그래밍언어활용 과목 과락으로 불합격입니다.");
        } else if (system < 40) {
            System.out.println("정보시스템구축관리 과목 과락으로 불합격입니다.");
        } else if (avg < 60) {
            System.out.println("평균 점수 60점 미만으로 불합격입니다.");
        } else {
        	System.out.println("합격을 축하합니다!");
        }
		 */
		
		// 과락도 없고 평균도 60점을 넘고
		if(s1>=40 && s2>=40 && d3>=40 && p4 >=40 && i5 >=40 && average>=60) {
			System.out.println("합격을 축하합니다.");
		}
		// 과락은 없지만 평균이 60점을 못 넘은 경우
		else if (s1>=40 && s2>=40 && d3>=40 && p4 >=40 && i5 >=40) {
			if (average<60) {
			System.out.println("평균 점수 60점 미만으로 불합격입니다.");
			}
		}
		// 평균은 넘지만 과락이 있는 경우 (나는 과락이 되면 과락이 된 제일 첫번째 과목만 뜨게 하는게 아닌 과락이 된 모든 과목을 뜨게함)
		else if (average >=60) {
			if(s1<40 || s2<40 || d3<40 || p4<40 || i5<40) {
				if (s1<40) {
					if(s2<40 || d3 <40 || p4 <40 || i5<40) {
						System.out.println("소프트웨어설계 과목 과락으로 불합격입니다.");
					}
				}
				if (s2<40) {
					if(s1<40 || d3 <40 || p4 <40 || i5<40) {
						System.out.println("소프트웨어개발 과목 과락으로 불합격입니다.");
					}
				}
				if (d3<40) {
					if(s1<40 || s2 <40 || p4 <40 || i5<40) {
						System.out.println("데이터베이스구축 과목 과락으로 불합격입니다.");
					}
				}
				if (p4<40) {
					if(s1<40 || s2 <40 || d3 <40 || i5<40) {
						System.out.println("프로그래밍언어활용 과목 과락으로 불합격입니다.");
					}
				}
				if (i5<40) {
					if(s1<40 || s2 <40 || d3 <40 || p4<40) {
						System.out.println("정보시스템구축관리 과목 과락으로 불합격입니다.");
					}
				}
			}
		}
	}
}
