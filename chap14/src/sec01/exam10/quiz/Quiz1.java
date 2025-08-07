package sec01.exam10.quiz;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Quiz1 {
//	Quiz
//	FileWriter를 사용하여 
//	"C:/Temp/output.txt" 파일을 생성하고
//	output.txt 파일 안에 아래 배열의 요소를 한 줄에 하나씩 추가해주세요.
//	String[] lines = {"첫 번째 줄입니다.", "두 번째 줄입니다.", "세 번째 줄입니다."};

//  힌트: 줄바꿈하는 방법 "\r\n" (window)또는 "\n" (linux/macOS)      / 자바에서는 둘다 동작함 호환성좋아서
	
	public static void main(String[] args) {
		String[] lines = {"첫 번째 줄입니다.", "두 번째 줄입니다.", "세 번째 줄입니다."};
		
		try(Writer writer = new FileWriter("C:/Temp/output.txt")) {
			for (String line : lines) {
				writer.write(line + "\n");
//				writer.write("\n");
			} 
			writer.flush();
			System.out.println("파일 저장 완료!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
		
		
		
		
	/*
		Writer writer = new FileWriter("C:/Temp/output.txt");
		
		String[] lines = {"첫 번째 줄입니다.", "두 번째 줄입니다.", "세 번째 줄입니다."};
		
		for (int i = 0; i < lines.length; i++) {
			String str = lines[i];
			writer.write(str);
			System.out.println(); // 콘솔에 줄바꿈하는거도 파일에는 아무런 영향이 없음
		}
		writer.flush();
		writer.close();

	}
	 */

