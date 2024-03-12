package edu.kh.test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		List<Integer> List = new ArrayList<>();	//ArrayList로 받아야함 : 이유 : 
		List.add(4);
		List.add(-5);
		List.add(0);
		List.add(-3);
		List.add(2);
		List.add(1);		//List를 Integer로 받았기 때문에 실수는 들어갈수 없다.

		for(int num : List) {
			char ch;
			
			if(num < 0 ) {	//음수표현 = 은 0을 포함
				ch = '-';
			} else if(num > 0) {
				ch = '+';
			} else {
				System.out.println("@@@@@@@@@");
				continue;
			}
			
			for(int i = 0; i<Math.abs(num);i++) {	//배열의 시작을 0부터해야함
				System.out.print(ch);			//println 이 아니라 print로 써야함
			}
			System.out.println();
		}
	}

}
