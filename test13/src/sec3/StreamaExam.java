package sec3;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

//Stream : 입출력 방식의 제어 연속된 복합체(컬랙션 프레임워크 형태)로 이루어진 데이터
//Stream 방식이란? 연속된 복합체인 컬랙션 프레임워크를 훨씬 간결하고, 효과적으로 처리하기
//위한 람다식 방식의 처리
//배열형은 별도의 stream을 생성하지 않고, Arrays 클래스를 활용한다.
//Arrays.stream(연속된 복합체 이름).메소드();
public class StreamaExam {
	public static void main(String[] args) {
		int[] arr = {95, 80, 100, 85, 90};	//배열 선언
		//stream을 이용한 순회 출력 => stream 은 반복문을 forEach로 활용한다.
		Arrays.stream(arr).forEach(n -> System.out.println(n));
		
		//stream 을 이용한 합계 계산
		System.out.println("\nstream 합계");
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		//stream 을 이용한 평균 계산
		System.out.println("\nstream 평균");
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println(avg);
		
		//stream을 이용한 최대값 계산
		System.out.println("\nstream 최대값");
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println(max);
		
		//stream을 이용한 최소값 계산
		System.out.println("\nstream 최소값");
		OptionalInt min = Arrays.stream(arr).min();
		System.out.println(min);
		
		//stream 을 이요한 요소수 계산
		System.out.println("\nstream 요소 갯수");
		int cnt = (int) Arrays.stream(arr).count();
		System.out.println(cnt);
	}

}
