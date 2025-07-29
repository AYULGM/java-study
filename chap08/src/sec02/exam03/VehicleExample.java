package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare(); vehicle 인터페이스 타입에 없는 멤버는 사용 불가
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
	}

}
