package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child(); // 자동 타입 변환 (차일드 -> 패런츠로)
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		// Parent 타입에 (이 객체들이?) 없으므로 쓸 수 없다.
//		parent.field2 = "data2";
//		parent.method3();
		
		Child child = (Child) parent; // 강제 타입 변환 ( 패런츠 -> 차일드로)
		child.field2 = "yyy";
		child.method3();
	}

}
