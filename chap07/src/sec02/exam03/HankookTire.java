package sec02.exam03;

public class HankookTire extends Tire{

	
	// 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	} // alt + shift + s 누르고 제네레이트 슈퍼클래스 누름
	
	// 메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
}
