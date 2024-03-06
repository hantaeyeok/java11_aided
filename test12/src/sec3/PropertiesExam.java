package sec3;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesExam {
	public static void main(String[] args) {
		//Properties 선언 및 생성
		Properties pro = new Properties();
		
		pro.setProperty("job", "developer");			//문자열로 추가, setProperty를 사용해서 추가
		pro.setProperty("name", "hantaeyeok");			//"name" element
		pro.setProperty("age", "27");
		pro.setProperty("local", "bucheon");
		
		System.out.println(pro);
		System.out.println("element 수 : "+pro.size()); 						
		System.out.println("개별 접근 pro 엘리먼트 값 name : "+pro.getProperty("name"));
		System.out.println();
	
		//properties 의 순회 => 열거형으로 해당 엘리먼트의 키(속성) 을 가져와 처리해야함
//		for(String s : pro) {} => 오류 
		Enumeration e = pro.propertyNames();
		while(e.hasMoreElements()) {
			String el = (String) e.nextElement();
			System.out.println(el+":"+pro.getProperty(el));
		}
		
	
	}

}
