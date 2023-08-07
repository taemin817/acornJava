package day15;

public class C {

	public void 메서드(int su) throws OverNumberException {
		// 예외를 발생시키는 코드
		if(su>100) {
			throw new OverNumberException();
		}
		System.out.println("메서드 C");
	}
}
