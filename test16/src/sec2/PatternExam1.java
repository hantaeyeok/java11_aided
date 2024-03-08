package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Pattern : 특정 데이터의 형식이 맞는지 비교하려고 할 경우 데이터 형식을 지정하는 클래스
//Matcher : 특정 패턴의 형태가 맞는지 비교하는 클래스
//정규식(Reg Expression) RegEx
public class PatternExam1 {
//암호가 글자가 맞는지 특수문자가 맞는지 영문이 맞는지와 같은 패스워드 및 암호에 사용
	public static void main(String[] args) {
		String[] dt = {"bag","kim1004","9to6","8to5","single","Mom","ABC","김기태","^_^","1234"};
//		Pattern p = Pattern.compile("[a-z]*");		//영문 소문자로만 구성된 데이터  //영문 소문자 비교 *은 모든 것을 의미
//		Pattern p = Pattern.compile("[0-9]*");		//숫자로만 구성된 데이터
//		Pattern p = Pattern.compile("[0-9a-z]*");	//숫자와 영문 소문자로만 구성된 데이터
//		Pattern p = Pattern.compile("[A-Za-z]*");	//영문 대문자 또는 소문자로만 구성된 데이터
//		Pattern p = Pattern.compile("s[A-Za-z]*");	//s로 시작하면서 영문 대문자 또는 소문자로만 구성된 데이터
//		Pattern p = Pattern.compile("[가-힣]*");		//한글로만 구성된 데이터
//		Pattern p = Pattern.compile("e$*");			//특정 문자로 끝나는 경우 뮨자 뒤에 $	웹에서 사용가능
//		Pattern p = Pattern.compile("^b*");			//특정 문자로 시작하는 경우 문자 앞에^	웹에서 사용가능
//		Pattern p = Pattern.compile("[0-9]*");			//모든 값이 숫자인 데이터
		Pattern p = Pattern.compile("[0-9]*");
		
		for(int i = 0; i<dt.length;i++) {
			Matcher m =p.matcher(dt[i]); 				//Matcher : 비교할때 사용 
			if(m.matches()) {
				System.out.println("형식 일치 : "+dt[i]);
			} else {
				System.out.println("불일치 : ");
			}
		}
		
		
		
	}

}
