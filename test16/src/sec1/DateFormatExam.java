package sec1;

import java.text.SimpleDateFormat;
import java.util.Date;

//SimpleDateFormat : 날짜 표시 형식을 지정할 때 활용하는 클래스
public class DateFormatExam {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		//표시형식 코드(날짜) : y-년, M-월, d-일, h-시, m-분, s-초 E-요일, a-오전/오후, W-몇번째 주 , w-년 중 몇 번재 주
		SimpleDateFormat fmt1 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		SimpleDateFormat fmt2 = new SimpleDateFormat("yyyy-MM-dd-hh-mm:ss");
		SimpleDateFormat fmt3 = new SimpleDateFormat("오늘날짜 : yyyy년 MM월 dd일(E),현재시간 : a hh시 mm분 ss초");	//오늘날짜 : 2024년 03월 08일(금),현재시간 : 오전 10시 12분 49초
		SimpleDateFormat fmt4 = new SimpleDateFormat("yyyy년 MM월 W번째 주");
		SimpleDateFormat fmt5 = new SimpleDateFormat("yyyy년 MM월 w번째 주");
		
		//날짜 데이터에서 특정 표시형식이 부여된 문자열로 변환
		//날짜데이터=>문자열
		String t1 = fmt1.format(today);
		String t2 = fmt2.format(today);
		String t3 = fmt3.format(today);
		String t4 = fmt4.format(today);
		String t5 = fmt5.format(today);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);
		
		//
		
	}

}
