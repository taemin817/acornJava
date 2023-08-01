package day11.생성자;

public class MyMath2 {

	// static : 멤버변수를 만들지 않고 기능을 만들고 제공하고 싶을 때
	// new로 객체를 만들지 않아도 된다.		클래스명.메서드이름()  으로 사용
	
//	public static int addInt(int su1, int su2) {
//		return su1+su2;
//	}
//	public static double addDouble(double su1, double su2) {
//		return su1+su2;
//	}
	
	public static int add(int su1, int su2) {
		return su1+su2;
	}
	public static double add(double su1, double su2) {
		return su1+su2;
	}
}
