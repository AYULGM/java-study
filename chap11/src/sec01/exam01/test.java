package sec01.exam01;

public class test {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		boolean result = obj1.equals(obj2);
		
		boolean result1 = (obj1 == obj2);
		
		System.out.println(result);
		System.out.println(result1);
	}

}
