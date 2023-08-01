package day11.접근제어자Test;

public class C {
	
	// default : 같은 피키지 않에 잇는 클래스에게만 접근 허용
	public static void 메서드1() {
		System.out.println("메서드1 동작");
	}
	
	static void 메서드2() {
		System.out.println("메서드2 동작");
	}
}
