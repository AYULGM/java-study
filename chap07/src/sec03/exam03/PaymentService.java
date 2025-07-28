package sec03.exam03;

// 부모 클래스: 공통 결제 서비스 -> (추상화) -> 추상 클래스

public abstract class PaymentService {
//	public  class PaymentService {
//	public void pay(int amount) { // <-- 실제로는 실행 안됨 ( 현재 자식들이 다 재정의해서 쓰고있음)
//		System.out.println("결제 금액: " + amount + "원");
//		System.out.println("결제를 처리합니다.");
//	} // 어차피 쓰지도않는데 4줄 다 주석처리
	
	// 추상 메소드 : 자식 클래스에서 추상메소드는 반드시 재정의 해야함 (바디가 없으니 에러가 걸려서 abstract로 미완성임을 알려줘야함) 
	// 그 후에 추상메소드가 있다면 클래스도 미완성이라는뜻이니 위쪽에 클래스에도 abstract 붙여줘야함
	public abstract void pay(int amount);
}

// (참고)
// 인터페이스로 바꿔도 될까?
// 결제 수단에 따라 공통 필드나 일부 구현 로직이 없다면 인터페이스로 만들어도 됨
// 그러나 공통 필드나 공통 메소드 구현이 필요하다면 추상 클래스가 더 적합