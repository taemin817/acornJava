package day15;

public class C_Test {

	public static void main(String[] args) {

		C c = new C();
		try {
			c.메서드(101);
		} catch (OverNumberException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			// 예외 발생/미발생 상관없이 수행되는 코드
		}
		System.out.println("정상종료");
	}

}
