package homework;

public class Homework1 {

	public static void main(String[] args) {

	}

}
/*
chap05. 배열 과제
https://devkgn24.notion.site/14ffda8bae5780d6a9f2fdc204a7cfe6
1번 문제: Arrays.sort()를 사용하지 않고 직접 구현 => 인접한 두 값을 비교하고 순서를 바꾸는 과정을 반복
배열 길이 n이면 최대 n-1회전이 필요
<예시>
정렬 대상: {5, 3, 8, 4, 2}
1회전 → {3, 5, 4, 2, 8}
2회전 → {3, 4, 2, 5, 8}
3회전 → {3, 2, 4, 5, 8}
4회전 → {2, 3, 4, 5, 8} ← 정렬 완료

4번 문제: 이 문제에서는 Arrays.sort() 메소드를 이용하여 정렬
6, 7, 8번 문제: Arrays.copyOf() 메소드를 이용하여 복사
*/