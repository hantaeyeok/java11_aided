package sec0;
//상대경로와 절대경로 확인
import java.io.File;
import java.io.IOException;

public class FileExam2 {

	public static void main(String[] args) throws IOException {
		File f1 = new File("a.txt");				//현재 디렉토리에 파일이 있든 없든 파일 객체 생성
		File f2 = new File("../sec1/a.txt"); 		//현재 패키지(디렉토리)는 sec0인데 상위 디렉토리로 이동한 후 sec1 디렉토리의 a.txt 의 파일객체를 생성
		
		//파일의 절대 경로 지정
		//d:\\hty\\java2\\
		File f3 = new File("d:"+File.separator+"hty"+File.separator+"java2"+File.separator+"a.txt");
		String path = "d:\\hty\\java2\\";
		File f4 = new File(path,"a.xtx");
		File f5 = new File("d:\\hty\\java2\\","a.txt");
	}

}
/*
if(f1 == null) {
	System.out.println("현재 파일이 존재하지 않습니다.");
} else {
	System.out.println("현재 파일이 존재합니다.");
}
*/