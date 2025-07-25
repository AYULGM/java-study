package sec01.exam03_2.quiz;

public class Point {
	protected int x; //만약 private으로하면 getter,setter 만들어야함
	protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    public void location() {
//        System.out.println("x=" + x + ", y=" + y);
//    } 문제가 간단해서 수정
    
    public String location() {
        return "x=" + x + ", y=" + y;
    }
}
