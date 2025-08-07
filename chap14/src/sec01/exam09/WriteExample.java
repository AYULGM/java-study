package sec01.exam09;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("C:/Temp/test9.txt");
		
		char[] array = {'A','걱','B','C','어'};
		
		writer.write(array,1,3);
		writer.flush(); 
		writer.close(); 
		// 걱BC 로 아주잘들어감
	}

}
