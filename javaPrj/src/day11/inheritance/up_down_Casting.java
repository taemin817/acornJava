package day11.inheritance;

public class up_down_Casting {

	public static void main(String[] args) {

		Cat cat1 = new Cat();
		cat1.쥐를잡는다();
		
		// 상속관계에서
		// Animal = 부모(상위), Cat = 자식(하위)
		// 부모형 참조형변수로 다룰 수 있는 이유 : 부모의 내용이 반드시 있기때문에
		// type : 크기, 해석
		
		// upcasting (자동형변환)
		Animal animal = new Cat();  //
		//  animal. -> 쥐를잡는다() 가 인식되지않는다. 부모형의 값만큼 인식
		
		// downcasting. new의 실체가 중요 (명시적형변환)
		Cat cat2 = (Cat)animal;
		// cat2. -> 쥐를잡는다() 가 인식됨.
		cat2.쥐를잡는다();
		
		//Animal animal2 = new Animal();
		//Cat cat3 = (Cat)animal2;
		//cat3.쥐를잡는다(); // 문법적으로 허용하지만 불가능. 잘못된 다운캐스팅
	}

}