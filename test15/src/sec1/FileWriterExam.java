package sec1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//FileWriter : 
public class FileWriterExam {
	public static void main(String[] args) throws IOException {
		File file = new File("e.txt");
		if(!(file.exists())) {
			file.createNewFile();
		} else {
			System.out.println("파일이 존재합니다.");
		}
		BufferedWriter fw = new BufferedWriter(new FileWriter(file, true));					//true 시 읽기전용에서 쓰기 전용으로 
		fw.write("줄도 가능하고 문자열도 가능해");
		fw.newLine();//줄바꿈
		fw.write("꿀잠 자고 싶어요");
		fw.newLine();
		fw.write("집에 가고 싶어요");
		fw.flush();
		
		fw.close();
		
	}

}
