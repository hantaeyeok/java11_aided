package sec2;

import java.util.List;
import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		List<Notice> nVector = new Vector<>();
		
		
		//글쓰기
		nVector.add(new Notice("제목1","내용1","작성자1"));		//추가
		nVector.add(new Notice("제목2","내용2","작성자2"));
		nVector.add(new Notice("제목3","내용3","작성자3"));
		nVector.add(new Notice("제목4","내용4","작성자4"));
		nVector.add(new Notice("제목5","내용5","작성자5"));
		nVector.add(new Notice("제목6","내용6","작성자6"));
		
		//글목록
		System.out.println("제목\t내용\t작성자");
		for(Notice n : nVector) {
			System.out.println(n.getTitle()+"\t"+n.getContent()+"\t"+n.getAuthor());
		}
		
		
		nVector.remove(2);	//제거 인덱스가 2인 인스턴스 제거
		Notice no = new Notice("제목3","내용3","작성자3");
		nVector.set(4,no);	//중간에 삽입 인스턴스를 인덱스가 4인 곳에 삽입
		
		System.out.println("편집후");
		System.out.println("제목\t내용\t작성자");
		for(int i = 0; i < nVector.size();i++) {
			Notice n = nVector.get(i);
			System.out.println(n.getTitle()+"\t"+n.getContent()+"\t"+n.getAuthor());
		}
		
	}

}
