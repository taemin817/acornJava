package day11.inheritance;

// extends(확장) : 상속받을 때 쓰는 키워드
public class Cat extends Animal {
	
	public void 쥐를잡는다() {
		System.out.println("쥐를 잡는다");
	}
	
	// override : 부모의 메서드를 재정의하는 것
	// 부모의 메서드를 재정의할 때는 반드시 입력,반환 정보가 모두 같아야 함
	public void bark() {
		System.out.println("miya");
	}
}
