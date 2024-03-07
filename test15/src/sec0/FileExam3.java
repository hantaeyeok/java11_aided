package sec0;

import java.io.File;
import java.io.IOException;
import java.util.Date;

//v파일 과 디렉토리 제어
public class FileExam3 {

	public static void main(String[] args) throws IOException {
		File f = new File("student");
		f.mkdir();		//디렉토리 생성  test15가 현재 디렉토리이므로  test15안에 student 디렉토리 생성
		
		File f2 = new File("manage/teacher/kt");
		f2.mkdirs();	//디렉토리생성 test15 안에 mange 안에 teacher 안에 kt가 차례대로 생긴다.
						//mkdir은 이미 생성되어있으면 생기지 않음
							
		//디렉토리 생성 날짜와 시간 변경하기 
		f.setLastModified(new Date().getTime());
		
		//디렉토리 읽기 전용으로 변환
		f.setReadOnly();
	}

}
