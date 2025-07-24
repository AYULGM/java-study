package sec04.exam05.quiz;

public class Calculator {

	public int getEvenTotal(int begin, int end) { // b,e처럼해도되는데 변수명을 그냥 맞추자
		int sum = 0;
		for (int i = begin; i <= end; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
