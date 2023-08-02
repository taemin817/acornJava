package day12.김현수;

public class 김현수_Gram extends 김현수_Notebook {
	String name;
	String gpu;
	
	
	// 기본생성자 없음
	
	public 김현수_Gram(String cpu, int ram, String name, String gpu) {
		super(cpu, ram);		// 부모의 매개변수가 있는 생성자를 호출하는 코드
								// 명시적으로 부모의 생성자를 호출하는 코드가 없으면 super()룰 호출
		this.name = name;
		this.gpu = gpu;
	}
	
	public String toString() {
		return name + cpu + ram + gpu;
	}
}
