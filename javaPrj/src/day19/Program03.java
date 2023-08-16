package day19;

public class Program03 {

	public static void main(String[] args) {
		
		// 책정보를 담을 수 있는 객체(구조가 있는 애) 생성!
		// 객체 : 변수와 변수를 다루는 메서드로 구성
		Book b = new Book("자바의정석", 28000, "도우출판사");
		b.메서드();	// b객체의 정보가 전달됨  this 참조형변수에 저장
	}
}
                        