package sec4;

import java.util.Stack;

//스택(Stack) : 탑 같이 입력할 때는 쌓아 올려지고, 출력할 때는 반대로 맨 마지막에 입력한 가장 위에 입력된 데이터부터 된다.
//LIFO(List In First Out)-후입선출
//Stack 에 데이터를 입력하는 것을 Push
//Stack 에 데이터를 빼는 것을 pop 맨위의 데이터
//Stack 에 데이터 조회는 peek 

//Stack 반대 que
public class StackExam {

	public static void main(String[] args) {
		Stack<String> stack = new Stack();
		
		//요소추가
		stack.push("사과");
		stack.push("파인애플");
		stack.push("멜론");
		stack.push("체리");
		stack.push("암라");
		stack.push("볼수강");
		
		System.out.println(stack);
		
		System.out.println(stack.peek());		//맨 마지막 요소 반환
		System.out.println(stack.peek());
		System.out.println(stack.pop());		//맨 마지막 요소 반환 후 제거
	
	
	}

}
