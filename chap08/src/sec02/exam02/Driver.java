package sec02.exam02;

public class Driver {
	// 매개변수로 Vehicle 인터페이스를 구현한 다양한 객체가 들어올 수 있음(느슨한 결합)
	public void drive(Vehicle vehicle) {
		vehicle.run(); // 구현 객체의 재정의된 run()이 호출됨
		// 구현 객체가 바뀌어도 run()이라는 사용법은 바뀌지 않음(장점)
		// 그 말은 결국 버스가 들어오든 택시가 들어오든 똑같은 코드
	}
}
