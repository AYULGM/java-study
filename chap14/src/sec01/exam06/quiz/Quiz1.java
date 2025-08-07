package sec01.exam06.quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;import java.nio.channels.ClosedByInterruptException;

public class Quiz1 {
//	Quiz
//	FileInputStream을 사용하여 
//	애국가1.dat 파일을 읽어와서 콘솔에 표준 출력하세요.

//	[출력]
//	동해물과 백두산이 마르고 닳도록 하느님이 보우하사
//	우리나라 만세 무궁화 삼천리 화려강산
//	대한사람 대한으로 길이 보전하세
//	남산위에 저 소나무 철갑을 두른듯
//	바람서리 불변함은 우리기상 일세
//	무궁화 삼천리 화려강산 
//	대한사람 대한으로 길이보전하세

//	힌트: FileInputStream은 바이트 기반 스트림이므로 
//	바이트 배열 단위로 읽어와서 바이트 배열에 저장하고 이를 문자열로 변환 (String 생성자 이용)

	public static void main(String[] args) throws Exception {
		// 바이트 기반 스트림은 바이트 단위로 데이터를 읽음 -> 문자의 코드값만 처리
		
		try(InputStream is = new FileInputStream("C:/Temp/애국가1.dat")) { //한글 1자는 3바이트
		
			// 테스트: 3바이트로 인코딩 된 것들을 1바이트씩 읽어와서 출력
//			int data;
//			while ((data = is.read()) != -1) { 
//				System.out.println(data); //256 104 105 150 147 247 145 .... 이렇게 출력됨 256 104 105 이게 '동'한 글자겠지
//			}
			
			byte[] buffer = new byte[1024]; // 크기는 적당히 만들어줌 , 한번에 1024바이트 한번에 읽어옴
			int bytesRead; //읽어올 바이트 수를 저장할 변수
			while((bytesRead = is.read(buffer)) != -1) {
				// 읽은 바이트 배열을 문자열로 변환 (디코딩)
				String str = new String(buffer, 0, bytesRead, "UTF-8"); //bytesRead로 지정안하면 뒤에 공백이 들어감
				// 인덱스 0부터 정확히 읽은 문자 수만큼 문자열로 만듦
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 이렇게 바이트를 직접 읽고 수동으로 디코딩(비추천)
		// 가능은 하지만 인코딩 경계 문제(멀티바이트 문자 잘림 등)가 있어서 복잡하고 오류 위험이 큼
		// => 문자 기반 스트림 사용
		
		
		/* 내가 한건 치워 놓기 (틀림)
		InputStream is = new FileInputStream("C:/Temp/애국가1.dat");
		byte[] buffer = new byte[10000];
		String restored = new String(buffer, "UTF-8"); // 디코딩
		while (true) {
			int readByteNum = is.read(buffer);
			if (readByteNum != -1) {
				break; // 읽은 바이트가 있다면
			}
			for (int i = 0; i < readByteNum; i++) {
				System.out.println(restored);
			}

		}
		is.close();
	}
	*/
}
}
