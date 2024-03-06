package sec3;

import java.util.HashMap;
import java.util.Map;

//자료구조 자료의 논리적인 저장 원리에 따른 구조
//1. 단순구조(primitive) : 정수, 실수, 문자, 문자열, 논리형
//2. 선형구조(Sequence)  : 배열(Array), 리스트(List), 스택(Stack), 큐(Queue), 덱(deque)		//선형구조는 순서가잇는 것 , 참조형
//3. 비선형구조(Non-Sequence) : 맵(Map), 트리(Tree), 그래프(Graph), 셋(Set)							//참조형
//
public class HashMapExam {
	public static void main(String[] args) {
		//선언방법
		Map<String, String> map0 =new HashMap<String,String>();			//형변환가능	/Map 인터페이스를 활용한 HashMap생성
		HashMap<String, String> map1 =new HashMap<String,String>();		//형변환불가능	/ HashMap 선언 및 생성 표준식
		HashMap<String, String> map2 =new HashMap<>();					//생성자에 앞서 선언한 인자의 <> 생략가능
		HashMap<String, String> map3 =new HashMap<>(map1);				//맵의 복제
		//배열시 개수 지정 => String[] arr = new String[10];					//맵의 초기 용량은 기복적으로 16개
		HashMap<String, String> map4 =new HashMap<>(10);				//초기 용량 지정(capacity) - 초기 용량 지정보다 더 많은 데이터를 저장하게 되면, 자동적으로 초기용량의 배로 증가됨
		HashMap<String, String> map5 =new HashMap<>(10,0.7f);			//10개까지 저장할수있지만 70프로까지만 저장하겠다. //load factor : 0.7f한 부분 : 사용 확률 지정
		HashMap<String, String> map6 =new HashMap<>() {{				//기본 key 와 그에 해당하는 값을 적용하여 생성
			put("name","김기태");
		}};
		
		//
		HashMap<Integer,String> fruits = new HashMap<>();
		fruits.put(1, "사과");			//요소(Entry) 추가
		fruits.put(2, "딸기");
		fruits.put(3, "샤인머스킷");
		fruits.put(4, "망고");
		fruits.put(5, "납작복숭아");
		fruits.put(6, "키위");
		fruits.put(7, "바나나");
		
		System.out.println("변경 전");
		System.out.println(fruits);
		
		fruits.remove(5);				//키가 5인 요소 지우기
		
		System.out.println("변경 후");
		System.out.println(fruits);
		
//		fruits.clear();
//		System.out.println("비운 후");
//		System.out.println(fruits);
		
		for(Integer i : fruits.keySet()) {
			System.out.println(i+":"+fruits.get(i));
		}
		
		if(fruits.containsValue("키위")) {
			System.out.println("해당 HashMap에 키위가 존재합니다.");
		} else {
			System.out.println("해당 HashMap에 키위가 존재하지 않습니다.");
			fruits.put(8, "키위");
		}
		
		
		
		
		
	}

}
