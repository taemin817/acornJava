package day13.ObjectEx;

public class Ex01 {

	public static void main(String[] args) {

		A a = new A();
		System.out.println(a.toString());	// 클래스 정보를 줌
		// 부모형으로 축소
		Object o = a; //upcasting
		// 오버라이드 된 메서드가 우선권을 가짐
		// a객체의 toString 메서드가 호출됨
	}

}
