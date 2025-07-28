package sec03.exam03.quiz;

public abstract class Employee {
	// 필드
	private String type;
	private String name;
	private String dept; 
	// 생성자
	public Employee(String type, String name, String dept) { //자동완성으로 뚝딱만드심
		this.type = type;
		this.name = name;
		this.dept = dept;
	}

	public String getType() { // private기 때문에 getter,setter을 만들어줘야하는데 문제에서 set은 필요없음
		return type;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}
	
	//메소드
	
	public abstract int getPay();
	public abstract String getInfo();
	
	
}
