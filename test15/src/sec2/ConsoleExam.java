package sec2;

import java.io.Console;
import java.io.IOException;

//Console : 
public class ConsoleExam {
	public static void main(String[] args) throws IOException {
		Console con = System.console();
		
		System.out.println("이름 : ");
		String name = con.readLine();
		
		System.out.println("점수 입력 : ");
		int point = Integer.parseInt(con.readLine());
		
		System.out.println("체중 : ");
		double weight = Double.parseDouble(con.readLine());
		
		System.out.println("비밀번호 : ");
		char[] pwc = con.readPassword();
		String pw = new String(pwc);	//문자배열을 문자열로 형 변환
		
		
		Person p = new Person(name,point, weight);
		System.out.println(p.toString());
		System.out.println("비밀번호 : "+pw);
	
	}

}
