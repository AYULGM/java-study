package sec02.exam04.quiz;

public abstract class Animal {
	// 필드
	private String kind;
	private int leg;
	
	// 생성자
	public Animal(String kind, int leg) {
		this.kind = kind;
		this.leg = leg;
	}
	
	// 메소드
	public String getKind() {
		return kind;
	}

	public int getLeg() {
		return leg;
	}
	
	public abstract void eat();
	public abstract void sound();
}
