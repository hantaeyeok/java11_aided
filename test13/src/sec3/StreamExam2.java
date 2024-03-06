package sec3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//String 타입의 List Stream 방식 활용
public class StreamExam2 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("한태역");
		lst.add("조우진");
		lst.add("박은성");
		lst.add("강민우");
		lst.add("장인범");
		lst.add("박범수");
		
		lst.size();
		//ArrayList의 Stream화
		Stream<String> streamLst = lst.stream();
		System.out.println("\n정렬 전");
		streamLst.forEach(s -> System.out.println(s));
		
		//정렬 stream//정렬할때 .sorted() 사용
		System.out.println("\n정렬 후");
		lst.stream().sorted().forEach(s -> System.out.println(s));
		
		//요소의 수 출력
		System.out.println("\n요소의 수");
		int cnt = (int) lst.stream().count();
		System.out.println(cnt);
		
	}

}
