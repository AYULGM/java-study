package sec01.exam07;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		// 데이터 도착지를 test7.txt 파일로 하는 문자 기반 파일 출력 스트림을 생성
		Writer writer = new FileWriter("C:/Temp/test7.txt");
		
//		char a = 'A';
//		char b = 'B';
//		char c = 'C';
		// 알파벳 1자는 1바이트 이므로 -> 3바이트로 저장됨
		
		char a ='가'; //유니코드 44032 (2바이트 잡아먹음), 2바이트를 보내니 짤리지않아 잘 나옴
		char b ='나';
		char c ='다';
		// 한글 1자는 3바이트 이므로 -> 9바이트로 저장됨(문자기반파일출력스트림이라 한글이 깨지지 않음)
		// 문자 -> 바이트 변환 시(자동 인코딩)
		// 한글 1자 UTF-8 인코딩 시 3바이트
		
		// 한 문자씩 세번 출력
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush();
		writer.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
