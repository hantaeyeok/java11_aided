package sec2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		List<Member> memList = new ArrayList<Member>();
		List<Member> memList2 = new ArrayList<Member>();
		for(int i =1;i<10;i++) {
			Member mem = new Member(i, "kim"+i,"abcd"+i+i,"김"+i,0);
			memList.add(mem);
		}
		
		
		Member tmp1 = new Member(11,"kang","abcd","이성하",0);
		System.out.println(tmp1.getId()+"의 존재 유무"+memList.contains(tmp1)); 		//인덱스가 있나 없나 혹인
		
		for(Member m : memList) {		//List 순회1
			System.out.println(m.toString());
		}
	
		memList.remove(3);				//인텍스가 3인 Member 인스턴스가 제거
		
		for(int i = 0; i< memList.size();i++) {		//List 순회 2
			Member m = memList.get(i);
			System.out.println(m.toString());
		}

		if(memList2.isEmpty()) {
			System.out.println("비어있는 리스트");
		} else {
			System.out.println("내용이 있는 리스트");
		}
	
		List<String> names =new ArrayList<>();
		names.add("이민규");
		names.add("이성하");
		names.add("이연정");
		names.add("이예린");
		names.add("이원석");
		names.add("이종우");
		names.add("이희훈");
		
		if(names.contains("이연정")) {
			System.out.println("이연정 데이터 존재");
		} else {
			System.out.println("이연정 데이터 존재하지 않음");
		}
		names.clear();
		if(names.isEmpty()) {
			System.out.println("이연정 데이터 존재");
		} else {
			for(String s : names) {
				System.out.println(s);
			}
		}
		
		//add, remove, contains, isEmpty, size, get
	}

}
