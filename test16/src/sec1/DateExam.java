package sec1;

import java.time.LocalDate;
import java.util.Date;

//Date는 문자열로 취급함
//Date
public class DateExam {

	public static void main(String[] args) {
		
		Date date1 = new Date();
		@SuppressWarnings("deprecation")
		Date date2 = new Date(1998,2,05,3,00,0);
		@SuppressWarnings("deprecation")
		Date date3 = new Date("Mon 02 Apr 2001 03:00:00 +0900");	//+0900 : REF 822 규격
		//지역 이름(Global/Local) : KST,  RFC 822 : +0900
		//국가 코드 : KR, 언어 코드 : KO => KO_KR
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);

		System.out.println("**** LocalDate ****");
	
		//
		LocalDate now1 = LocalDate.now();		//static 이라서 new 사용 안하고 특정 메소드 사용
		System.out.println("날짜 데이터");
		System.out.println(now1);	//날자 데이터
		//날짜데이터 => 문자열 데이터 valueOf, toString
		System.out.println("날짜데이터 => 문자열 데이터");
		String now2 = now1.toString();		//toString으로 문자열 
		System.out.println(now2);
		//문자열 데이터 => 날짜 데이터
		System.out.println("문자열 데이터 => 날짜 데이터");
		LocalDate now3 = LocalDate.parse(now2);
		System.out.println(now3);
				
	
	}

}
