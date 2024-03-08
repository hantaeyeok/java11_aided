package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExam2 {

	public static void main(String[] args) {
		
		//이메일 패턴
		String[] email = {"kkt09012","kbs@naver","kkt@gmail.com","kki@kr","kkt@daum.com"};
		Pattern p1 = Pattern.compile("^[a-z0-9]+@[a-z0-9]+\\.[a-z]+$");			//이메일패턴
		Pattern p2 = Pattern.compile("\\w+@\\w+\\.\\w+(\\\\.\\\\w+)?");
		
		for(int i= 0; i < email.length;i++) {
			Matcher m = p1.matcher(email[i]);
			if(m.matches()) {
				System.out.println("이메일 형식이 맞습니다.");
				System.out.println(email[i]);
			}
		}	
		
		for(int i= 0; i < email.length;i++) {
			Matcher m1 = p2.matcher(email[i]);
			if(m1.matches()) {
				System.out.println("이메일 형식이 맞습니다.");
				System.out.println(email[i]);
			}
		}
		//휴대폰 번호 패턴
		String[] phone = {"02-1234-1234","010-2896-1004","032-7676-2424","010-8284-6954","01-78-789","12-12-1"};
		Pattern p3 = Pattern.compile("010-\\d{4}-\\d{4}");
		for(int i = 0;i<phone.length;i++) {
			Matcher m2 = p3.matcher(phone[i]);
			if(m2.matches()) {
				System.out.println("휴대폰 번호 형식이 맞습니다.");
				System.out.println(phone[i]);
			}
		}
		
		//주민번호 패턴
		String[] jm = {"941207-1234567","010203-6489012","381425-1234567","850119-234567","780528-1456123"};
		Pattern p4 = Pattern.compile("\\d{6}\\-[1-4]\\d{6}");
		for(int i = 0; i<jm.length;i++) {
			Matcher m3 = p4.matcher(jm[i]);
			if(m3.matches()) {
				System.out.println("주민번호 방식이 맞습니다.");
				System.out.println(jm[i]);
			}
		}
		
		//우편번호 패턴 : 100번대(1xx-yy)~700번대(7xx~yy)
		String[] post = {"123-123","212-34","816-24","5434-54","953-39","683-39",};
		Pattern p5 = Pattern.compile("[1-7]\\d{2}-\\d{2}$");
		for(int i = 0;i<post.length;i++) {
			Matcher m4 = p5.matcher(post[i]);
			if(m4.matches()) {
				System.out.println("우편번호 형식이 맞습니다.");
				System.out.println(post[i]);
			}
		}
	}

}
