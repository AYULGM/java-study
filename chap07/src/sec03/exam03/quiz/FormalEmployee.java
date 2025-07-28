package sec03.exam03.quiz;

public class FormalEmployee extends Employee {
	// 필드
	private int empNo;
	private int salary;
	
	// 생성자
	
	public FormalEmployee(String name, String dept, int empNo, int salary) { // String type은 필요없음
		super("정규직", name , dept); // name, dept의 초기화는 부모한테 넘기고
		this.empNo = empNo;
		this.salary = salary;
	}

	@Override
	public int getPay() {
		return salary / 12;
	}

	@Override
	public String getInfo() {
		return getType() + ", " + getName() + ", " + getDept() + ", " + empNo + ", " + salary;
	}
	
}
