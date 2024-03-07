package sec2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//예외 떠넘기기
public class ThrowsExam {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = null;
		String absolutPath = "d:\\ hty\\java\\test14\\bin\\sec2\\a.txt";	//절대경로	 //경로를 처음부터 끝가지 지정하는 것을  절대 경로라한다.
		String relativePath = "./a.txt";			//상대경로 -> 현재 데렉토리
		String relativePath2 = "../a.txt";			//: sec2에 있을 경우 상대경로 -> 상위 디렉토리
		String relativePath3 = "../../a.txt";			//: test14에   있을 경우 상대경로 -> 상위 디렉토리 
		
		fis = new FileInputStream(absolutPath);	
		if(fis != null) {
			fis.close();
		}
	}

}
