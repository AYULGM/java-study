package sec01.exam12;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		// bytes 배열에 키보드로부터 읽은 키코드를 저장
		System.out.println("입력: ");
		int readByteNo = System.in.read(bytes); // 키보드로부터 사용자 입력을 받아들임 (일반예외)
		// 입력 스트림에서 바이트들을 여러 개 읽어 배열에 저장하고 읽은 바이트 수를 반환(int형으로)
		// System.in: 시스템의 표준 입력 장치(키보드)
		// read(): 입력된 키코드를 읽어라
		// System.in.read가 byte를 하나 하나 읽어들임 그래서 2장때는 반복문으로 처리했었음
		
		System.out.println(readByteNo);
		// 예: Hello 엔터를 치면 바이트 배열에 저장하고 7을 리턴함
		// 5가 아닌 7인 이유? 엔터의 키코드인 \r(CR) \n(LF) 을 포함하기때문에 2가 추가되서 그럼
		
		String str = new String(bytes, 0, readByteNo - 2); 
		// readByteNo -2하는 이유는 배열이 100개 자리라 쓸데없는 공백하고 엔터(\r \n)2개 없애려고 넣는거임
		System.out.println(str);
	}

}
