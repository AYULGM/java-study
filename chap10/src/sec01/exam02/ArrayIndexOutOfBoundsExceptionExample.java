package sec01.exam02;

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int result = arr[0] + arr[2];
//		int result = arr[0] + arr[3]; // 예외 발생 (예외처리를 안 배워서 주석처리함)
		
		System.out.println(result);
		
		String data1 = args[0]; // 예외 발생 (String[] args에 매개변수를 안줘서)
		String data2 = args[1]; // Run Configuration에 매개변수 넣어주면 예외 해결
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
	}

}
