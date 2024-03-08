package sec1;

import java.util.Calendar;

//Calendar : 날짜와 시간을 따로 빼서 쓸떄
public class CalendarExam {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();			//getInstance() : 사용하면 싱클톤이다.	//Date Today = new Date(); 와 같다.
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int day = today.get(Calendar.DATE);					//일은 day는 DATE로 호출해야함.
		
		int doy = today.get(Calendar.DAY_OF_YEAR);			//년 중 몇일째
		int dom = today.get(Calendar.DAY_OF_MONTH);			//월 중 몇일째
		int dow = today.get(Calendar.DAY_OF_WEEK);			//주 중 몇일째
		
		int hour12 = today.get(Calendar.HOUR);				//12시간제
		int hour24 = today.get(Calendar.HOUR_OF_DAY);		//24시간제
		int minute = today.get(Calendar.MINUTE);			//분
		int second = today.get(Calendar.SECOND);
		int ampm = today.get(Calendar.AM_PM);				
		
		
		int timeZone = today.get(Calendar.ZONE_OFFSET); 		//? 밀리초 => 시간(/1000/60/60)
		int lastDate = today.getActualMaximum(Calendar.DATE);	//이달의 마지막날
		int firstDate = today.getActualMinimum(Calendar.DATE);	//이달의 첫번째 날
		
		System.out.println("현재년도 : "+year);
		System.out.println("현재 월 : "+month);
		System.out.println("현재 일 : "+day);
	
		System.out.println("오늘은 "+year+"년의"+doy+"일 째");
		System.out.println("오늘은 " +month+ "월의"+dom+"번째 날");
		System.out.println("오늘은 이번주의 "+dow+"번째 날");
		
/*		switch(dow) {
		case 1 :
			System.out.println("일요일");
			break;
		case 2 :	
			System.out.println("일요일");
			break;
		case 3 :
			System.out.println("일요일");
			break;
		}
*/
		String[] wk = {"","일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		System.out.println("오늘은 "+wk[dow]+"입니다.");
		
		System.out.println("현재시간(24)"+hour24+":"+minute+":"+second);
		System.out.println("현재시간(12)");
		if(ampm==0) {
			System.out.println("오전 : "+hour12+":"+minute+":"+second);
		} else {
			System.out.println("오전 : "+hour12+":"+minute+":"+second);
		}
		System.out.println(ampm);
		
		System.out.println("timeZone : "+(timeZone/1000/60/60));
		System.out.println("lastDate : "+lastDate);
		System.out.println("firstDate : "+firstDate);
	}

}
