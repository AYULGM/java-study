package sec06.exam05.package2;

import sec06.exam05.package1.A; //클래스이름이 같아서 exam04로 임포트될수도있음 주의 

public class C {
	// 생성자
			public C() {
				A a = new A();
				a.field1 = 1;
//				a.field2 = 1;
//				a.field3 = 1;
				
				a.method1();
//				a.method2();
//				a.method3();
			}
}
