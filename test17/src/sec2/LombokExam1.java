package sec2;

public class LombokExam1 {

	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setId("hty");
		m1.setPw("123465");
		m1.setPoint(100);
		System.out.println(m1.toString());
		
		Board b1 = new Board();
		b1.setBno(1);
		b1.setContent("내용");
		b1.setTitle("제목");
		b1.setViewCnt(1);
		
		

	}

}
