package exam;

import java.util.ArrayList;
import java.util.List;

class Book {
	private String name;
	private int price;
	//
	public Book() {}
	public Book(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	//
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
}
public class Exam7 {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("자바",25000));
		bookList.add(new Book("파이썬",15000));
		bookList.add(new Book("안드로이드",30000));
		
		//순회
		bookList.stream().forEach(lst -> System.out.println(lst.toString()));
		
		//1. 모든 책의 가격의 합계
		System.out.println("\n모든 책의 가격 합계");
		System.out.println("총 금액 : "+bookList.stream().mapToInt(a -> a.getPrice()).sum());
//		OptionalDouble tot = 
		
		//2. 책의 가격이 20000원 이상인 책의 이름을 정렬하여 출력
		System.out.println("\n책의 가격이 20000 이상인 책의 이름 정렬");
		bookList.stream().filter(a-> a.getPrice()>=20000).map(b -> b.getName()).sorted().forEach(s -> System.out.println(s));

	}

}
