package sec2;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;
//ObjectMapper 변환해주는 

class User{
	private String name;
	private int age;
	public User() {}
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
}

public class JacksonExam1 {
	public static void main(String[] args) throws IOException{
		ObjectMapper mapper = new ObjectMapper();	
		User user = new User("hty",27);
		try {		
			//객체를 JSON 타입의 파일로 변환 : 자바스크립에서 열어볼수 잇는 파일
			mapper.writeValue(new File("member.json"), user);	//User:{name:"김기태", "age":43}
			//객체를 JSON 타입의 String으로 변환 :json string
			String jsonUser = mapper.writeValueAsString(user);
			//"User:{'name':'김기태', 'age':43}"
			System.out.println(jsonUser);
			//객체를 JSON 타입을 정렬하여  String으로 변환
			
		} catch(JsonGenerationException e) {
			e.printStackTrace();
			System.out.println("JSON 변환 실패");
		}
	
	
	
	
	}

}
