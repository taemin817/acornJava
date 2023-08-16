package day19;


// Book메서드의 type을 정의할 때
public class Book {

	// Book b = new Book(); -> new 에 의해 구조가 있는 변수가 생성됨
	String 책이름;
	int 가격;
	String 출판사;

	// 생성자
	public Book() {
		// 기본생성자
	}
	public Book(String 책이름, int 가격, String 출판사) {
		super();
		this.책이름 = 책이름;
		this.가격 = 가격;
		this.출판사 = 출판사;
	}
	
	// toString
	// 메서드
	// 이 메서드를 사용하는 시점 -> 객체가 생성된(혹은 멤버변수가 만들어진) 이후
	public void 메서드() {
//		System.out.println("이 곳에서 위의 변수들을 다룬다고 생각해");
		System.out.println("메서드()");

	}

}
