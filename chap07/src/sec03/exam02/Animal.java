package sec03.exam02;

//이 예제에서는 공통 기능 제공 + 하위 클래스가 나머지를 구현하도록 강제
public abstract class Animal { // 코드에 추상 메소드가 들어갔기때문에 얘도 abstract 붙여줘야함
	public String kind;
	
	// 공통 기능: 모든 동물은 숨을 쉰다.
	public void breathe() {
		System.out.println("숨을 쉽니다.");
}
	
	// 추상 메소드
	// 미완성 메소드, 실행부(몸통, {})가 없는 메소드
	// 당연하지만 추상 메소드는 추상 클래스 안에서만 정의 가능
	// 추상 메소드를 쓰는 경우는 꼭 필요하지만 자식마다 다르게 구현될 것으로 예상되는 경우에 사용
	// 동일한 이름으로 구현을 강제하는 효과가 있음 // sound라는 이름으로 동일하게 구현해야함
	public abstract void sound(); // 바디 부분을 없애서 abstract 붙여줘야함

}