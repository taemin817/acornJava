package day15;

public class D_Test {

	public static void main(String[] args) {

		D d = new D();
		E e = new E();
		// MyRunnable -> 추상메서드를 가진 인터페이스임
		d.메서드(e);  // 매개변수로 인터페이스가 있다면 인터페이스를 구현한 객체를 인자로 넘겨줘야함
		// 별다섯개			   // MyRunnable 인터페이스를 구현한 객체를 넘겨줘야함
		System.out.println();
		d.메서드(new G());	// 익명개체 사용이다~~
		System.out.println();
		d.메서드(new F()); // 익명객체, 일회성으로 객체를 사용할 때 사용
		// 3단
		System.out.println();
		
		// 익명클래스 작성 -> new 인터페이스이름(){};
		// d.메서드(new Myrunnable() {});
		d.메서드(new MyRunnable() {

			@Override
			public void run() {
				System.out.println("실행코드");
				for (int i = 1; i <= 3; i++) {
					System.out.print("★");
				}
			}
		});		
		System.out.println();
		d.메서드(new MyRunnable() {	// 익명클래스

			@Override
			public void run() {
				System.out.println("실행코드");
				System.out.println("9단 출력");
				for (int i = 1; i <= 9; i++) {
					System.out.println("9*" + i + "=" + 9 * i);
				}
			}
		});
		// 인터페이스를 구현할 때
		// 1.이름이 있는 클래스를 작성(implements -> 인터페이스 상속)
		// 2.이름이 없는 익명클래스를 작성 -> 상속받아 클래스 만들때만 작성가능
		d.메서드(new MyRunnable() {
			
			@Override
			public void run() {
				System.out.println("누군가의 코드를 실행해주라아");
			}
		});
	}

}
