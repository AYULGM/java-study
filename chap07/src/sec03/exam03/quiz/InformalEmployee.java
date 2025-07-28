package sec03.exam03.quiz;

public class InformalEmployee extends Employee {
	private int primaryPay;
	
	public InformalEmployee(String name, String dept, int primaryPay) {
		super("비정규직", name, dept);
		this.primaryPay = primaryPay;
	}

	@Override
	public int getPay() {
		return primaryPay;
	}

	@Override
	public String getInfo() { //getType() + ", " + getName() + ", " + getDept() + ", " + 
		// 이게 중복되니까 부모 return에다 써도될듯
		return getType() + ", " + getName() + ", " + getDept() + ", " + primaryPay;
	}
}
