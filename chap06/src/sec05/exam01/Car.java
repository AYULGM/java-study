package sec05.exam01;

import java.util.Iterator;

public class Car {
	// 필드 (인스턴스 필드)
	String model; //모델명
	int speed; //현재속도
	
	// 생성자
	Car(String model) {
		this.model = model;
	}
	
	// 메소드 (인스턴스 메소드) , 인스턴스(= 객체에 소속된)
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i); // this 생략 가능
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
			// 충돌날 일이 없으므로 this 생략 가능 , 만약 매개변수에 model이 들어왔으면 충돌날수있음
		}
	}
}
