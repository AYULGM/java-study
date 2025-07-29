package sec02.exam04.quiz;

public class Dog extends Animal {

	
	public Dog() { //매개변수를 지웠음
		super("강아지", 4); // 부모에게 강아지 , 4을 전달함
	}

	@Override
	public void eat() {
		System.out.println("주인이 주는대로 먹는다.");
	}

	@Override
	public void sound() {
		System.out.println("멍멍 짖는다.");
	}

	
	
}