package sec03.exam03.quiz;

import java.io.File;

public class FileManager {
//	Quiz
//	먼저 "C:/test/sub" 폴더 아래에 test1.txt, test2.txt, test3.txt 파일을 만들어주세요.
//	(파일 탐색기에서 직접 만들고 시작)

//	FileManager 클래스에 deleteFile(dir: File): void 메소드를 정의합니다.
//	실행 클래스에서 FileManager 클래스를 객체화한 다음 deleteFile() 메소드를 호출하세요.
//	deleteFile()은 "C:/test/sub" 아래에 있는 파일들을 모두 삭제하는 기능을 수행합니다.

//	[출력]
//	C:\test\sub\2025 -> 삭제 안됨
//	C:\test\sub\test1.txt -> 삭제 완료
//	C:\test\sub\test2.txt -> 삭제 완료
//	C:\test\sub\test3.txt -> 삭제 완료
	
//	public void deleteFile(File f) {
	public void deleteFile() {
		File dir = new File("C:/test/sub");

		if (dir.exists() && dir.isDirectory()) {
			File[] contents = dir.listFiles();

			for (File file : contents) {
				if (file.isFile()) {
					file.delete();
					System.out.println(file.getName() + "-> 삭제완료");
				} else {
					System.out.println(file.getName() + " -> 삭제안됨");
				}
			}
		}

	}
}
