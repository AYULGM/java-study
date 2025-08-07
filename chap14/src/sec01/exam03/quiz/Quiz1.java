package sec01.exam03.quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Quiz1 {
//	Quiz
//	FileOutputStream을 사용하여 
//	"C:/Temp/애국가1.dat" 파일을 생성하고
//	애국가1.dat 파일에 아래와 같은 문장을 출력하세요.

//	String song = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사"
//			+ "\n우리나라 만세 무궁화 삼천리 화려강산"
//			+ "\n대한사람 대한으로 길이 보전하세";

//  힌트: FileOutputStream은 바이트 기반 스트림이므로 문자열을 인코딩을 지정하여 바이트 배열로 변환해야 함

	public static void main(String[] args) {

		String song = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사" + "\n우리나라 만세 무궁화 삼천리 화려강산" + "\n대한사람 대한으로 길이 보전하세";
		
		try (OutputStream os = new FileOutputStream("C:/Temp/애국가1.dat")) {
			byte[] bytes = song.getBytes("UTF-8"); // 글자 깨짐 방지를 위해 인코딩 명시 , 생략하면 시스템의 기본 문자셋 사용
//			뒤에 배울 문자기반스트림을 쓰면 이 코드도 필요없긴함 
//			"UTF-8"은 기본설정 되어있어서 안써도되긴한데 명시적으로 쓰는거
			os.write(bytes);
			os.flush(); // 명시적으로 호출해도 되고 안해도 됨(자동 close()에서 처리)
			System.out.println("파일 저장 완료!");
		} catch (IOException e) { // 각 예외의 부모타입으로 받아준다.
			e.printStackTrace(); // 이거 안해주면 예외가 발생해도 콘솔에 아무 메시지도 출력되지 않음.
								 // 안쓰면 예외 잡기만 하고 아무조치도 안한 꼴 , 개발자는 무슨 문제가 있었는지 알수 X
		}


//		byte[] bytes = str.getBytes("UTF-8");  // 인코딩 지정
//		String restored = new String(utf8Bytes, "UTF-8"); // 디코딩

	}

}
