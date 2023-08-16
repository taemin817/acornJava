package day20.thread;

public class 콜스택Ex {

	// 콜스택 : 메서드 수행에 필요한 메모리가 제공되는 공간
	// 스택 : 선입선출
	// 메서드가 호출되면 호출스택에 메모리가 할당되고 종료되면 해제됨
	
	void 메서드1() {
		메서드2();
		System.out.println("메서드1 호출");
	}
	private void 메서드2() {
		System.out.println("메서드2 호출");
	}
	public static void main(String[] args) {
		
		콜스택Ex p = new 콜스택Ex();
		p.메서드1();
		System.out.println("메인 bye");

	}

}
