package sec0;
//FileExam1~3은 파일정보 와 디렉토리 생성
import java.io.File;
import java.io.IOException;

public class FileExam1 {

	public static void main(String[] args) throws IOException {
		String file1 = "d:\\hty\\java2\\a.txt";								//로컬 경로 
		String file2 = "http://192.168.1.104/data/menual/java.txt";			//원격 경로 웹의 경로(url)
		
		File f1 = new File(file1);
		
		
		String fileName = f1.getName();
		System.out.println(fileName);
		//a.txt의 a만 출력하게 하기
		int pos = fileName.lastIndexOf(".");							//문자열에서 특정 문자를 찾을때 IndexOf
		System.out.println("확장자와 파일명의 구분을 나타내는 점의 위치 : "+pos);		//1
		
		System.out.println("확장자를 제외한 파일의 이름 : "+fileName.substring(0,pos));	//substring
		System.out.println("확장자 : "+fileName.substring(pos+1));
		
		System.out.println("경로를 포함한 파일의 이름(절대경로) : "+f1.getAbsolutePath());//
		System.out.println("경로를 포한한 파일의 이름(상대경로) : "+f1.getPath()); 		//기재한 경로를 나타냄
		System.out.println("파일이 속해 있는 상위(부모) 디렉토리 : "+f1.getParent()); 		//
		System.out.println("경로 구분자 : "+File.separator);				//File.separatorChar 와 동일
		
		//시스템 변수 값 가져오기 => System.getProperty("시스템변수명")
		//현재 디렉토리를 그대로 출력하고 싶을때
		System.out.println("현재 사용자 디렉토리(user.dir) : "+System.getProperty("user.dir"));		//getProperty?
		
		//자바의 디렉토리
		System.out.println("자바 디렉토리(sun.boot.class.path) : "+System.getProperty("sun.boot.class.path"));
		
		//파일이랑 상관없이 
		System.out.println("운영쳊(OS) 환경변수 값 : "+System.getenv());
		System.out.println("JAVA_HOME : "+System.getenv("JAVA_HOME"));
		
	}

}
