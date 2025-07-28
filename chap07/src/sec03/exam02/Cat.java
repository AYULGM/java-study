package sec03.exam02;

public class Cat extends Animal{// Cat에 마우스 올려보면 반드시 sound메소드를 만들라고뜸
	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}

}
