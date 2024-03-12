package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1_1 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
//			List<IPInfo> ipInfoList = null;		//List는 인터페이스 사용시 ipInfoList는 널이들어감, ArrayList 는 클래스
			List<IPInfo> ipInfoList = new ArrayList<>();	
			//ipInfoList는 ArrayList로 생성해야하지만, null로 대입하였으므로,
			//13-15
			//13-15 NullPointerException이 발생한다.
			
			ipInfoList.add(new IPInfo("123.123.123.123","홍길동"));
	//틀린부분		ipInfoList.add(new IPInfo("212,133,7,8"));
	//원인		생성자의 IPInfo 클래스에서 매개변수 하나만 전달 받는 생성자는 없으므로 객체생성이 불가능하다.
	//방법1) IPInfo클래스에 매개변수 ip 만 받는 생성자를 추가한다.
	//방법2) IPInfo 객체 생성시 ip와 user의 매개변수 값을 모두 넣는다.	
	//
			ipInfoList.add(new IPInfo("212.133.7.8","hty"));
			ipInfoList.add(new IPInfo("177.233.111.222","고길순"));
			
			System.out.print("ip 입력 : ");
			String ip = sc.next();
			
			for(int i = 0; i <ipInfoList.size();i++) {
			if(ipInfoList.get(i).getIp().equals(ip)) {
				System.out.println(ipInfoList.get(i));
				break;
			}
			
			System.out.println("노일치");
		
			}
		
	}

}


