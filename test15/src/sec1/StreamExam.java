package sec1;
//파일/키보드/데이터 입력 출력 : 한줄로 만들어서 입출력을 하기 때문에 Stream이 필요하다.
//파일/키보드/데이터 입력 : FileInputStream,  BufferedInputStream,  FileReader, BufferedReader 
//파일/키보드/데이터 출력 : FileOutputStream, BufferedOutputStream, FileWriter, BufferedWriter
//Stream으로 끝나는 클래스는 데이터 입출력을 바이트 단윈로  	: FileInputStream,  BufferedInputStream, FileOutputStream, BufferedOutputStream,
//Stream으로 끝나지 않는 클래스는 데이터 입출력을 문자 단위로 	: FileReader, BufferedReader, FileWriter, BufferedWriter
//문자열 데이터 일 경우에는 writer, re
public class StreamExam {

	public static void main(String[] args) {
		String FileInputStream = 	"FileInputStream는 바이트 단위로 입력하기 위한 스트림";
		String BufferedInputStream ="BufferedInputStream는 바이트 단위로 입력하기 위한 스트림 : 메모리 버퍼로 로딩 후";
		String FileReader = 		"FileReader는 문자 단위로 입력하기 위한 스트림 ";
		String BufferedReader = 	"BufferedReader는 문자 단위로 입력하기 위한 스트림 : 메모리 버퍼로 로딩 후";
		String FileOUtputStream = 	"FileOUtputStream는 바이트 단위로 출력하기 위한 스트림";
		String BufferedOutputStream="BufferedOutputStream는 바이트 단위로 출력하기 위한 스트림 : 메모리 버퍼로 로딩 후";
		String FileWiter = 			"FileWiter는 문자 단위로 출력하기 위한 스트림";
		String BufferedWiter = 		"BufferedWiter는 문자 단위로 출력하기 위한 스트림 : 메모리 버퍼로 로딩 후";
		System.out.println(FileInputStream);
		System.out.println(BufferedInputStream);
		System.out.println(FileReader);
		System.out.println(BufferedReader);
		System.out.println(FileOUtputStream);
		System.out.println(BufferedOutputStream);
		System.out.println(FileWiter);
		System.out.println(BufferedWiter);
		
		
		

	}

}
