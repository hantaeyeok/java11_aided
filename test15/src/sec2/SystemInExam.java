package sec2;

import java.io.IOException;

//SystemIn
//
public class SystemInExam {
	public static void main(String[] args) throws IOException{
		//한글자 입력 
		System.out.println("영문 한 글자를 입력하고, [Enter]를 누르세요");
		int i ;
		try {
			i = System.in.read();		//아스키코드 한 글자 입력 => 바이트 단위 입력
			System.out.println(i);
			System.out.println("입력된 문자 : "+(char) i);			// 바이트 단위여서 형변환
		} catch(IOException e) {
			e.printStackTrace();
		}
	
	
	
	}

}
