package sec04.exam05.quiz;

public class Rectangle {
	int width;
	int height;
	
	public void area() { // 반환하지 않기때문에 void
		int result = width * height; // 밑에 result에 그냥 계산식 넣어도 상관x
		System.out.println("면적: " + result);
	}
	
	public void length() { // 반환하지 않기때문에 void
		int result = (width + height) * 2;
		System.out.println("둘레: " + result);
	}
}