package sec2;

import java.io.IOException;

public class SystemInExam2 {

	public static void main(String[] args) throws IOException {
		//키보드 여러 글자를 라인단위로 입력하여 출력
		System.out.println("영문 단어를 입력하고, [Enter]를 누르세요");
		int i ;
		String data ="";
		try {
			while((i = System.in.read()) != '\n') {
				System.out.println((char) i);			// 바이트 단위여서 형변환
				data += (char) i;
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("입력된 단어 또는 문장 : "+data);

		
	}

}
