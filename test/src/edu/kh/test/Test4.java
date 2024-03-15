package edu.kh.test;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		String names ="김기태 이순신 강감찬 고주몽";
		
		List<IPInfo> ipList = new ArrayList<>();
		ipList.add(new IPInfo("123.123.123.123","홍길동"));
		ipList.add(new IPInfo("212.133.7.8","hty"));
		ipList.add(new IPInfo("177.233.111.222","고길순"));
		ipList.add(new IPInfo("177.233.111.223","강감찬"));
		
		String str ="이순신";
		System.out.println("String");
		if(names.contains(str)) {					//
			System.out.println(str+"포함");
		} else {
			System.out.println(str+"이 포함 되지않습니다.");
		}
		
		
		System.out.println("ArrayList");	//잘못된 ArrayList 
		if(ipList.contains(str)) {							//순회해서 비교
			System.out.println(str+"포함");
		} else {
			System.out.println(str+"이 포함 되지않습니다.");
		}	
		
		
		System.out.println("순회");
		boolean sw = false;
		for(IPInfo i : ipList) {
			if(i.getUser().equals(str)) {
				sw = true;
			}
		}
		
		if(sw) {							//순회해서 비교
			System.out.println(str+"포함");
		} else {
			System.out.println(str+"이 포함 되지않습니다.");
		}	
		
	}

}
