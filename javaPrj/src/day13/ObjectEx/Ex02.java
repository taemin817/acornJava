package day13.ObjectEx;

public class Ex02 {
	public static void main(String[] args) {

		B b1 = new B(5);
		B b2 = new B(5);

		if(b1.equals(b2)) {
			System.out.println("두 객체는 같다");
		}
		
		B2 b3 = new B2(3);
		B2 b4 = new B2(3);

		if(b3.equals(b4)) {
			System.out.println("두 객체는 같습니다");
		}
		
		// Object의 equals()는 객체의 레퍼런스를 비교함
	}
}
