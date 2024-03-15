package edu.kh.test;

import java.util.List;


public class Test3 {
	public static void main(String[] args) {
		
		List<Integer> List = null;	//List 선언만 있고, 객체가 생성되지 않아 , nullpointerException이 발생
		
		List.add(4);
		List.add(-5);
		List.add(0);
		List.add(-3);
		List.add(2);
//		List.add(1.23456);	//
		
		for(int num : List) {
			char ch;
		
			if(num <=0) {
				ch = '-';
			} else if(num > 0) {
				ch ='+';
			} else {
				System.out.println("@@@@@@@@@@@@@");
				continue;
			}
			
			//int Math.abs(정수) : 정수의 절대값을 반환
			for(int i = 1; i < Math.abs(num); i ++) {
				System.out.println(ch);
			}
			System.out.println();
		}
		
	
	
	}

}
