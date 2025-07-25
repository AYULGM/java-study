package sec01.exam03_2.quiz;

public class Point3D extends Point {
	private int z;

	public Point3D(int x, int y, int z) {
		super(x, y); // 부모 클래스가 책임지는 초기화는 부모 생성자에 맡기는 게 좋다.
		this.z = z;
	}

//	@Override
//	public void location() {
//		System.out.println("x=" + x + ", y=" + y + ", z=" + z);
//	} 문제 수정
	
	@Override
	public String location() {
//        return "x=" + x + ", y=" + y + ", z=" + z;
        return super.location() + ", z=" + z;
    }
}
