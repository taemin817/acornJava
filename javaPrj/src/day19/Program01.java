package day19;

public class Program01 {
	
	
	// 기능을 제공할 코드를 작성하고 싶어서 클래스를 작성하는 경우 2가지의 선택
	// 1. static 사용
	// 2. static 미사용 -> 반드시 new가 필요함
	public void 메서드() {
		System.out.println("hello java");
	}

//	메인이 아닌 곳에서 System.out.println("hello java"); 불가능

	public static void main(String[] args) {

		Program01 p = new Program01();
		p.메서드();
	}

}
