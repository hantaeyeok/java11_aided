package sec0;

import java.io.File;
import java.io.IOException;

//FileExam1~3 : 파일 정보 및 디렉토리 생성
//파일 생성
public class FileExam4 {
	public static void main(String[] args) throws IOException {
		File file1 = new File("a.txt");
		File file2 = new File("b.txt");
		//file1 생성
		if(file1.createNewFile()) {
			System.out.println("File Created Success");
		}else {
			System.out.println("File already exists");
		}
		//file2 생성
		if(file2.createNewFile()) {
			System.out.println("File Created Success");
		}else {
			System.out.println("File already exists");
		}
		
		
		
		
	}

}
