package sec02.exam02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class NonBufferVsBufferExample {
// 파일의 크기가 너무 작으면 오히려 버퍼 붙이는게 성능 떨어질수있음 ( 버퍼보조스트림 자체도 시간을 쓰는거니까 )
	public static void main(String[] args) throws Exception {
		// 참고: 클래스명.class란? 해당 클래스의 Class 객체를 가리키는 문법
		// 저번에 배웠긴함  .class하면 그 클래스 객체의 정보를 지정하는거임
		// 해당 클래스 타입에 대한 메타정보(Class 객체)를 얻음
		
		// 기본 스트림 코드

		String originalFilePath1 = 
				NonBufferVsBufferExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "C:/Temp/targetFile1.jpg"; //originalFile1을 여기로 복사하는거임
		
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
				
		// 버퍼 보조 스트림을 적용한 코드

		String originalFilePath2 = 
				NonBufferVsBufferExample.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "C:/Temp/targetFile2.jpg"; //originalFile2를 여기로 복사하는거임
		
		FileInputStream fis2 = new FileInputStream(originalFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		// 기본 스트림 코드를 이용해서 복사
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않았을 때:\t" + nonBufferTime + "ns");
	
	
		// 버퍼 보조 스트림 코드를 이용해서 복사
			long bufferTime = copy(bis, bos);
			System.out.println("버퍼를 사용했을 때:\t\t" + bufferTime + "ns");
			
			fis.close();
			fos.close(); // 안닫아도 JVM이 닫아주긴하는데
			bis.close(); // 습관적으로 닫아주는게 좋지
			bos.close();
			// 참고: 연결된 보조 스트림만 닫아도 내부의 기본 스트림까지 자동으로 닫힘
		}

	static int data = -1; // 입력 스트림으로부터 데이터를 전혀 읽지 않았을 경우는 -1
	// 자동완성했을때 매개변수 앞에 File이 붙었었는데 다형성을 이용하기위해 떼줌
	// 매개 변수의 타입은 바이트 기반 스트림으로 그림, 음악, 텍스트 등 모든 종류의 파일을 복사하기 위해
	private static long copy(InputStream is, OutputStream os) throws Exception {
		
		long start = System.nanoTime(); // 시작 시간 저장
		// 파일 복사하는 방법
		// 원본 파일에서 읽은 1byte를 타겟 파일로 바로 출력 (1byte씩해도되고 배열로 묶어서 해도되고 여기선 1byte씩 했네)
		while (true) {
			data = is.read();
			if (data == -1) break;
			os.write(data);
		}
		os.flush();
		
		long end = System.nanoTime(); // 끝난 시간 저장
		return end - start; // 복사에 걸린 시간 리턴
	}

}
