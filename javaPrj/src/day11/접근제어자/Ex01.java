package day11.접근제어자;

import day11.접근제어자Test.C;

public class Ex01 {

	public static void main(String[] args) {
		// '접근'제어자
		// public : 완전 오픈
		// private : 내 클래스 안에서만 접근 허용
		// default : 접근에 대해 명시하지않으면 default를 가진다 
		
		A.메서드1();
		A.메서드2();
		
		B.메서드1();
		B.메서드2();
		
		C.메서드1(); // C의 메서드1이 public 이라 접근 가능
		
		// C의 메서드2가 pbulic이 아닌 default라 접근 불가(같은 패키지 안이라면 가능. 현재 다름)
		// C.메서드2();
	}


}
